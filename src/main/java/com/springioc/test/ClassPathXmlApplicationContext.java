package com.springioc.test;


import com.springioc.test.entity.UserEntity;

public class ClassPathXmlApplicationContext implements UserEntity {
    public void sayHello(){
        System.out.println("hello,spring");
    }
}