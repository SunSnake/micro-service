package com.microservice.order.http;

import java.nio.channels.Channel;

/**
 * author  zhaoqi
 * date  2020/11/5 15:16
 */
public abstract class AbstractTest<A extends AbstractTest<A, B>, B extends Channel> {
}
