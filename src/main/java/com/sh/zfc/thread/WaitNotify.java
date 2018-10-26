package com.sh.zfc.thread;

public class WaitNotify {
    static  Object lock = new Object();
    static boolean flag = false;


    public static void main(String[] args) {
        Thread wait =  new Thread(new WiteThread(),"wait");
        Thread notify =  new Thread(new NotifyThread(),"notify");
        Thread getLock =  new Thread(new GetLoThread(),"gety");

        new Thread();

        wait.start();
        notify.start();
        getLock.start();
    }

    static class WiteThread implements Runnable{
        public void run() {
            synchronized (lock){
                if (flag == false) {
                    try {
                     //   for (int i = 0; i < 5 ; i++) {
                            System.out.println("wait 5S , then return");
                            lock.wait(5000,100);
                     //   }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                    System.out.println("wait returned !");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait returned , but held for antoth 5s ");

            }
        }
    }

    static class NotifyThread implements Runnable{
        public void run() {
            synchronized (lock){
                System.out.println("notiyf is called , then held lock for 15S");
                try {
                    Thread.sleep(5000);
                    System.out.println("15S,finised!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag =  true;
                lock.notify();
            }
        }
    }

    static class GetLoThread implements Runnable{
        public void run() {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock){
                System.out.println("GetLoThread is called");
            }
        }
    }

}
