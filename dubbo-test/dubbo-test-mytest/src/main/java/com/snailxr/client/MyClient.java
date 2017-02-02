package com.snailxr.client;

import com.snailxr.server.service.SayHelloToClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by snailxr on 17/2/1.
 */
public class MyClient {
    public void sayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });

        context.start();

        //获取服务器那边的bean
        SayHelloToClient demoService = (SayHelloToClient) context.getBean("demoService");

        System.out.println(demoService.sayHello("lisi"));
    }
}