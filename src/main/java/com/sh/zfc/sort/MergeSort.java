package com.sh.zfc.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {


    public <T extends Comparable<? super T>>  T[]  sort(T[] input) {
        int len = input.length;
        if (len==1){
            return input;
        }else {
            T[] left = Arrays.copyOfRange(input , 0 , len/2 );
            T[] right = Arrays.copyOfRange(input , len/2, len);
            return merge(sort(left), sort(right));
        }

    }


    public <T extends Comparable<? super T>> T[] merge(T[] left, T[] right) {
        int lenleft = left.length;
        int lenright = right.length;
        T[] output = (T[]) Array.newInstance(left.getClass().getComponentType(), lenleft + lenright);

        int i = 0;
        int j = 0;
        int outputIndex = 0;
        while (i < lenleft && j < lenright) {
            if (left[i].compareTo(right[j]) < 0) {
                output[outputIndex++] = left[i++];
            } else {
                output[outputIndex++] = right[j++];
            }
        }
        if (i == lenleft) {
            for (; j < lenright; j++) {
                output[outputIndex++] = right[j];
            }
        } else {
            for (; i < lenleft; i++) {
                output[outputIndex++] = left[i];
            }
        }
        return output;
    }
}