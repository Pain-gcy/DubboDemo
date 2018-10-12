package com.demo.cnbn.dubbo.consumer;

import com.demo.cnbn.dubbo.api.DemoService;
import com.demo.cnbn.dubbo.api.DubboDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));


        DubboDemoService bean = context.getBean(DubboDemoService.class);
        System.out.println("consumer111");
        System.out.println(bean.getString());
    }
}
