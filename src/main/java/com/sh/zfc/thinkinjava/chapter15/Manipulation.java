package com.sh.zfc.thinkinjava.chapter15;

import java.lang.reflect.Array;

public class Manipulation<T extends String> {

    private T obj;

    public Manipulation(T obj) {
        this.obj = obj;
    }

    public Manipulation() {

    }

    public void manipulate(){
        obj.toString();
        obj.charAt(1);
        int[] b = new int[3];
        T[] c= (T[])Array.newInstance(Object.class,10);


    }


}
