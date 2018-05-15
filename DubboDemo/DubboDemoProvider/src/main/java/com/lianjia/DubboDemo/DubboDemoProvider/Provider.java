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
                new String[]{"dubbo-demo-provider.xml"}
        );
        context.start();
        System.in.read();
        /*为保证服务一直开着,利用输入流的阻塞来模拟*/
    }
}
