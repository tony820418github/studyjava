package com.sh.zfc.sort;

public class LSD {
    /*
    W: 字符串宽度
    d: 排序的位数，从右向左依次增加
     */
    public static void sort(String[] input , int W){
        int len = input.length;
        int R = 256;//Ascii码的个数
        String[] axu = new  String[len];

        for (int i = W; i>0 ; i--) {
            int count[] = new  int[R+1];
            for (int j = 0; j < len; j++) {
                count[input[j].charAt(i-1)+1]++;
            }

            for (int j = 0; j <R ; j++) {
                count[j+1] += count[j];
            }

            for (int j = 0; j < len; j++) {
                axu[count[input[j].charAt(i-1)]++] = input[j];
            }

            for (int j = 0; j < len; j++) {
                input[j] = axu[j];
            }

        }
    }



}
