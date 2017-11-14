package com.ws.demo.javaagent;

import com.ws.demo.javaagent.biz.Cache;
import com.ws.demo.javaagent.biz.impl.GuavaCache;

public class Main {

    public static void main(String[] args) {
        Cache cache = new GuavaCache();
        cache.put("demo", "abc");
    }
}
