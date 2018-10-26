package com.sh.zfc.proxy;

public class Teacher implements IPserson {
    @Override
    public void sayHello() {
        System.out.println("teacher say hello");
    }

    @Override
    public void printName() {
        System.out.println("teacher 's name");
    }
}
