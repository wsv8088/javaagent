package com.ws.demo.javaagent.biz.impl;

import com.ws.demo.javaagent.biz.Cache;

public class GuavaCache implements Cache {
    @Override
    public void put(String key, String value) {
        System.out.println(String.format("GuavaCache put [ Key:%s | Value:%s ]", key, value));
    }
}
