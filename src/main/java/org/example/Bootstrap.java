package org.example;

import org.example.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liangxiong
 * @version 1.0.0
 * @date 2020-01-17 12:25
 * @description 启动类
 **/
public class Bootstrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        int a = 0;
        for (int i = 0; i < 99; i++) {
            a = ++a;
        }
        System.out.println(a);

    }
}
