package com.sh.zfc.thread;

public class ThreadLocalTest {
    volatile Person person=new Person();

    public  synchronized String setAndGet(String name){
        //System.out.print(Thread.currentThread().getName()+":");
        person.name=name;
        //模拟网络延迟
        // TimeUnit.SECONDS.sleep(2);
        return person.name;
    }

    public static void main(String[] args) {
        ThreadLocalTest  threadLocal=new ThreadLocalTest();
        new Thread(()->System.out.println(threadLocal.setAndGet("arron")),"t1").start();
        new Thread(()->System.out.println(threadLocal.setAndGet("tony")),"t2").start();
    }
}

class Person{
    String name="tom";
    public Person(String name) {
        this.name=name;
    }

    public Person(){}
}