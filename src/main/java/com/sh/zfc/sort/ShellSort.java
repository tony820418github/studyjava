package com.sh.zfc.sort;

public class ShellSort {

    public <T extends Comparable<? super T>> void sort(T[] input){

                    int len = input.length;
                    int gap = len/2;

                    for (int h = gap; h >= 1 ; ) {
                        for (int i = h; i < len ; i++) {
                            for (int j = i; j >=h  &&  input[j].compareTo(input[j-h])<0; j = j-h) {
                                exange(input , j , j-h);
                }
            }
            h = h/2;
        }
    }

    public <T> void exange(T[] input , int a ,int b){
        T temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }


}
