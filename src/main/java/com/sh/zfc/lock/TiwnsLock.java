package com.sh.zfc.lock;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class TiwnsLock implements Lock {
    public static final class Sync extends AbstractQueuedSynchronizer {

        public Sync() {
            setState(2);
        }

        @Override
        protected int tryAcquireShared(int arg) {
            int current = getState();
            int newCount = current - arg;
            if (newCount >= 0) {
                compareAndSetState(current, newCount);
            }
            return newCount;
        }

        @Override
        protected boolean tryReleaseShared(int arg) {
            int current = getState();
            int newCount = current + arg;
            return compareAndSetState(current, newCount);
        }
    }

    Sync sync = new Sync();

    @Override
    public void lock() {
        sync.acquireShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.releaseShared(1);
    }

    @Override
    public Condition newCondition() {
        return  null;
    }

    public static void main(String[] args) {
        TiwnsLock tlock = new TiwnsLock();
        tlock.lock();
        System.out.println("lock1");
        tlock.lock();
        System.out.println("lock2");
        tlock.unlock();
        System.out.println("lock2 release!");
        tlock.lock();
        System.out.println("lock3");
    }
}
