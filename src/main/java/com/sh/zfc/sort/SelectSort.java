package com.sh.zfc.sort;

public class SelectSort {
    public int[] sort(int [] input){
        int temp;
        for (int i = 0; i < input.length-1; i++) {
            int minIndex = i;
            for (int j = i; j < input.length; j++) {
                if (input[minIndex] > input[j]) {
                    minIndex = j;
                }
            }
            temp =  input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
        return input;

    }
}
