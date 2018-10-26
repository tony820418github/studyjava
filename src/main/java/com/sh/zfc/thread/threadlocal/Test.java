package com.sh.zfc.thread.threadlocal;

import java.util.Date;


public class Test {
    public static void main(String[] args) {
        final MyThreadLocal t = new MyThreadLocal();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread() {
                public void run() {
                    t.process();
                    t.p();
                }
            };
            thread.start();
        }
        Date d1 = new Date();
        Date d2 = new Date();
        System.out.println(d1 == d2);
        System.out.println(d1.hashCode() == d2.hashCode());
    }
}
