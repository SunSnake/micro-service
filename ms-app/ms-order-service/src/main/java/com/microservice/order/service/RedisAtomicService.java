package com.microservice.order.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * author  zhaoqi
 * date  2020/11/2 16:20
 */
@Service("redisAtomicService")
@Slf4j
public class RedisAtomicService {

    @Resource(name = "readerTemplate")
    private List<StringRedisTemplate> readerTemplate;

    @Resource(name = "writerTemplate")
    private List<StringRedisTemplate> writerTemplate;

    /**
     * 根据key值获取数据
     */
    public String query(String key) {
        StringRedisTemplate redisTemplate = getRandomReader(key);
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 据key值判断value值是否存在
     */
    public Boolean isExist(String key) {
        return getRandomReader(key).hasKey(key);
    }

    /**
     * 设置缓存
     */
    public Boolean saveStr(String key, String value) {
        getRandomWriter(key).opsForValue().set(key, value);
        return true;
    }

    /**
     * 设置带有过期时间的缓存
     */
    public boolean saveStrWithExpire(String key, String value, long expireTime) {
        saveStrWithExpire(key, value, expireTime, TimeUnit.SECONDS);
        return true;
    }

    public boolean saveStrWithExpire(String key, String value, long expireTime, TimeUnit unit) {
        saveStr(key, value);
        getRandomWriter(key).expire(key, expireTime, unit);
        return true;
    }

    /**
     * 设置带有过期时间的缓存
     * 当key值不存在的情况下进行设置，如果key值已经存在，不做操作
     */
    public boolean saveStrIfNotExistWithExpire(String key, String value, int expireTime) {
        if (isExist(key)) {
            return true;
        }
        saveStrWithExpire(key, value, expireTime);
        return true;
    }

    /**
     * 根据key值删除缓存数据
     */
    public boolean delete(String key) {
        getRandomWriter(key).delete(key);
        return !isExist(key);
    }

    private StringRedisTemplate getRandomReader(String key){
        int mol = Math.floorMod(key.length(), readerTemplate.size());
        return readerTemplate.get(mol);
    }

    private StringRedisTemplate getRandomWriter(String key){
        int mol = Math.floorMod(key.length(), writerTemplate.size());
        return readerTemplate.get(mol);
    }

}
