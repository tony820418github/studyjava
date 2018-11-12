package com.sh.zfc.thread;

public class MyRunnable implements Runnable{
    public static Integer i = new Integer(0);

    @Override
    public void run() {
        while (true){
           synchronized (i){
                if(i<100){
                    i++;
                    System.out.println("i=" +i);
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1= new Thread(new MyRunnable());
        Thread t2= new Thread(new MyRunnable());
        Thread t3= new Thread(new MyRunnable());
        Thread t4= new Thread(new MyRunnable());
        Thread t5= new Thread(new MyRunnable());
        Thread t6= new Thread(new MyRunnable());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
