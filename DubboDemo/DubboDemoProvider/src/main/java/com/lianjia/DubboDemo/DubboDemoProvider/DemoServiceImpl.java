package com.lianjia.DubboDemo.DubboDemoProvider;

/**
 * @Aauthor:
 * @Date:2018/5/1114:00
 * @Description:
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String HelloWorld() {
        return "HelloWorld";
    }
}
