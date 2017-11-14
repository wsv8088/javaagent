package com.ws.demo.javaagent.agent;


import com.ws.demo.javaagent.transformer.Transformer;

import java.lang.instrument.Instrumentation;

public class PremainAgent {

    public static void premain(String args) {

    }

    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("代理类开始执行...,参数:" + args);

        instrumentation.addTransformer(new Transformer());
        System.out.println("代理类执行结束...");

    }
}
