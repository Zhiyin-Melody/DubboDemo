package com.lianjia.DubboDemo.DubboDemoProvider;

/**
 * @Aauthor:
 * @Date:2018/5/1114:00
 * @Description:实现接口；对服务消费方隐藏实现；
 *
 */
public class DemoServiceImpl implements DemoService {
/*实现接口，重载函数*/
    @Override
    public String HelloWorld() {
        return "HelloWorld";
    }

}
