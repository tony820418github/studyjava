package com.sh.zfc.thinkinjava;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chaper3 {


    public static void main(String[] args) {
        Random rd = new Random(1);
        for (int i = 0; i < 10; i++) {
            //System.out.println(rd.nextInt(4));
            System.out.println(ThreadLocalRandom.current().nextInt(4));
        }
    }

}
