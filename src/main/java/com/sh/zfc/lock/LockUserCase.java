package com.sh.zfc.lock;

import sun.awt.Mutex;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockUserCase {
    public static void main(String[] args) {
        ConcurrentHashMap<String  , String > chm = new ConcurrentHashMap<String , String>();
        chm.put("zfcKey" , "zfcValue");


        Lock lock = new ReentrantLock();
        lock.lock();
        try {

        }finally {
            lock.unlock();
        }

    }
}
