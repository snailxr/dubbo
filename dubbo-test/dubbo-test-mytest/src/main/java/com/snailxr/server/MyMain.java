package com.snailxr.server;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by snailxr on 17/2/1.
 */
public class MyMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationProvider.xml" });

        context.start();
        System.out.println("按任意键退出");
        System.in.read();

    }
}