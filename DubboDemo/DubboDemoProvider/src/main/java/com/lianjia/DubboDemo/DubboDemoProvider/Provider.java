package com.lianjia.DubboDemo.DubboDemoProvider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Aauthor:
 * @Date:2018/5/1114:03
 * @Description:
 */
public class Provider {
    public static void main(String[] args) throws IOException

    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META/spring/dubbo-demo-provider.xml"}
        );
        context.start();
        System.in.read();
    }
}
