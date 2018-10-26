package com.sh.zfc.thread.threadlocal;

import java.util.concurrent.ThreadLocalRandom;

public class Scope {
   static ThreadLocal<String>  local = new ThreadLocal<String>();

   ThreadLocalRandom radom =ThreadLocalRandom.current();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            new Thread(){
                @Override
                public void run() {
                    local.set("Thread-" + finalI);

                    for (int j = 0; j < 10; j++) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(local.get());
                    }

                }
            }.start();
        }

       // local = null;

        System.gc();

    }
}
