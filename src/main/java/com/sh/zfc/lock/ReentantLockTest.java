package com.sh.zfc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentantLockTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();


    }
}
