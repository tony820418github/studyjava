package com.sh.zfc;

import java.util.ArrayList;
import java.util.List;

public class ParameterType {

    public static void fun(List<? super Integer> list){
        list.add(new Integer(1));
        Integer first = (Integer) list.get(0);
        System.out.println(first);
    }



    public static void main(String[] args) {
        Object a = new Object();
        ArrayList<Object> alist= new ArrayList<Object>();
        alist.add(a);
        fun(alist);

//        fun(new ArrayList<Integer>());//ok
//        fun(new ArrayList<Number>());//ok
//        fun(.add(a));//ok

    }


}
