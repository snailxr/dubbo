package com.snailxr.server.service.impl;

import com.snailxr.server.service.SayHelloToClient;

/**
 * Created by snailxr on 17/2/1.
 */
public class SayHelloToClientImpl implements SayHelloToClient {

    public String sayHello(String hello){
        System.out.println("我接收到了：" + hello);
        return hello + "你也好啊！！！" ;
    }

}