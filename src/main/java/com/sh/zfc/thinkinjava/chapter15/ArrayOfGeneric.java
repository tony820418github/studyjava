package com.sh.zfc.thinkinjava.chapter15;

public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<String>[] gia;



    public static void main(String[] args) {
//        gia = (Generic<String>[]) new Object[SIZE];


        gia = (Generic<String>[])new  Generic[SIZE];

        gia[0] = new Generic<String>();

        gia[1] = (Generic<String>) new Object();
    }

}


class Generic<T>{}