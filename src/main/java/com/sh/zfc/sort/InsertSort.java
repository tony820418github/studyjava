package com.sh.zfc.sort;

import java.util.List;

public class InsertSort {
    public <T extends Comparable<? super T>>  void sort(T[] input){
        int j;
        for (int i = 1; i < input.length; i++) {
            T tmp = input[i];
            for ( j = i; j >0 && input[j-1].compareTo(tmp)>0; j--) {
                input[j] = input[j-1];
            }
            input[j] = tmp;
        }
    }

    public  void sortNoParameter(Comparable[] input){
        int j;
        for (int i = 1; i < input.length; i++) {
            Comparable tmp = input[i];
            for ( j = i; j >0 && input[j-1].compareTo(tmp)>0; j--) {
                input[j] = input[j-1];
            }
            input[j] = tmp;
        }
    }

}
