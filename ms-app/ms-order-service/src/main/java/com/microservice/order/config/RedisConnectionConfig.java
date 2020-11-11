package com.microservice.order.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.time.Duration;
import java.util.*;

/**
 * author  zhaoqi
 * date  2020/11/2 15:04
 */
@Configuration
public class RedisConnectionConfig {

    @Value("${spring.redis.masterName}")
    private String masterName;

    @Value("${spring.redis.sentinelCluster}")
    private String sentinelCluster;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.timeout}")
    private int redisTimeout;

    @Value("${spring.redis.database}")
    private int redisDb;

    @Value("${spring.redis.max-active}")
    private int maxActive;

    @Value("${spring.redis.max-wait}")
    private int maxWait;

    @Value("${spring.redis.max-idle}")
    private int maxIdle;

    @Value("${spring.redis.min-idle}")
    private int minIdle;

    @Bean(name = "readerTemplate")
    public List<StringRedisTemplate> getReaderTemplate() {
        return getRedisTemplateList(getMasterAndSlave(false));
    }

    @Bean(name = "writerTemplate")
    public List<StringRedisTemplate> getWriterTemplate() {
        return getRedisTemplateList(getMasterAndSlave(true));
    }

    private List<StringRedisTemplate> getRedisTemplateList(List<Map<String, String>> maps){
        List<StringRedisTemplate> readerTemplate = new ArrayList<>();
        for (Map<String, String> map : maps){
            HostAndPort hostAndPort = new HostAndPort(map.get("ip"), Integer.parseInt(map.get("port")));
            readerTemplate.add(new StringRedisTemplate(new JedisConnectionFactory(getRedisConfig(hostAndPort), getClientConfig())));
        }
        return readerTemplate;
    }

    private List<Map<String, String>> getMasterAndSlave(boolean isMaster){
        String[] cluster = sentinelCluster.split(",");
        String[] hostAndIp = cluster[0].split(":");
        Jedis sentinel = new Jedis(hostAndIp[0], Integer.parseInt(hostAndIp[1]));
        List<Map<String, String>> slaveMaps = sentinel.sentinelSlaves(masterName);
        List<Map<String, String>> masterMaps = sentinel.sentinelMasters();
        sentinel.close();

        if (isMaster){
            return masterMaps;
        }

        return slaveMaps;
    }

    private RedisStandaloneConfiguration getRedisConfig(HostAndPort hostAndPort){
        // 单点redis
        RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
        redisConfig.setHostName(hostAndPort.getHost());
        //redisConfig.setPassword(RedisPassword.of(password));
        redisConfig.setPassword(password);
        redisConfig.setPort(hostAndPort.getPort());
        redisConfig.setDatabase(redisDb);
        return redisConfig;
    }

    private JedisClientConfiguration getClientConfig(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(maxActive);
        poolConfig.setMaxIdle(maxIdle);
        poolConfig.setMaxWaitMillis(maxWait);
        poolConfig.setMinIdle(minIdle);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnReturn(false);
        poolConfig.setTestWhileIdle(true);
        return JedisClientConfiguration.builder().usePooling().poolConfig(poolConfig)
                .and().readTimeout(Duration.ofMillis(redisTimeout)).build();
    }

}
