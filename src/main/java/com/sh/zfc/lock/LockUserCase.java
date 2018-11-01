package com.sh.zfc.lock;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockUserCase {
    public static void main(String[] args) {
        ConcurrentHashMap<String  , String > chm = new ConcurrentHashMap<String , String>();
        chm.put("zfcKey" , "zfcValue");


        Lock lock = new ReentrantLock();

        Thread lockThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        lockThread1.start();





        Thread lockThread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    if (lock.tryLock(1,TimeUnit.SECONDS)) {
                        lock.unlock();
                    }else {
                        System.out.println("not get lock");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        lockThread.start();


    }
}
