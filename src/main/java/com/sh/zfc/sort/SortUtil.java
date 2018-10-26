package com.sh.zfc.sort;

public class SortUtil {
    public static <T>  void exchange(T[] input ,int lo  , int hi){
        T temp = input[lo];
        input[lo] = input[hi];
        input[hi] = temp;
    }


}
