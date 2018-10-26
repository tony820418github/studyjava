package com.sh.zfc.lock;

import java.util.concurrent.locks.LockSupport;

public class LockSupportTest {
    public static void main(String[] args)throws Exception {
        final Object obj = new Object();
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i=0;i<10;i++){
                    sum+=i;
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LockSupport.park();
                System.out.println(sum);
            }
        });

        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("unpark");
                LockSupport.unpark(Thread.currentThread());
            }
        });


        A.start();
        B.start();
        //睡眠一秒钟，保证线程A已经计算完成，阻塞在wait方法
        //Thread.sleep(10000);
        //System.out.println("unpark");
        //LockSupport.unpark(A);
    }
}
