package com.lianjia.DubboDemo.DubboDemoProvider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Aauthor:
 * @Date:2018/5/1114:47
 * @Description:
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-demo-consumer.xml"}
        );
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");

        // execute remote invocation

        String Result = demoService.HelloWorld();

        // show the result

        System.out.println(Result);
    }
}
