package com.sh.zfc.proxy;

public class Student implements IPserson {
    @Override
    public void sayHello() {
        System.out.println("student say hello");
    }

    @Override
    public void printName() {
        System.out.println("student 's name");
    }
}
