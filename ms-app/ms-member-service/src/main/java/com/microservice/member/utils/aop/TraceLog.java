package com.microservice.member.utils.aop;

import java.lang.annotation.*;

/**
 * author  zhaoqi
 * date  2020/10/22 16:26
 * 自定义操作日志注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TraceLog {
    String operModul() default ""; // 操作模块
    String operType() default "";  // 操作类型
    String operDesc() default "";  // 操作说明
}
