package com.demo.cnbn.dubbo.consumer;

import com.demo.cnbn.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer222222 start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
