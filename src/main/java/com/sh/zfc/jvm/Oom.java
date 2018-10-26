package com.sh.zfc.jvm;

public class Oom {
    static  int count;

    public void rec(){
        System.out.println(count++);
        rec();
    }


    public static void main(String[] args) throws InterruptedException {

       //     Oom oom = new Oom();

       //     oom.rec();

        int ts = 10000;
        //byte[] s = new byte[1024*256];
        Thread[] t = new Thread[ts];
        for (int i = 0; i < ts; i++) {
            t[i] = new Thread(new Mythresd(i) , " zf Thread" + i);
            t[i].start();
        }
        Thread.sleep(10000);
        System.out.println("exit");
    }

    public static class Mythresd implements Runnable{
        int num;
        public Mythresd(int i ) {
            num = i ;
            System.out.println("Thread = " + i+ "created");
        }

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
