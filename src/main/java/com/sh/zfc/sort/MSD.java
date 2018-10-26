package com.sh.zfc.sort;

public class MSD {
   static int R = 256;
   static int M = 15;
   static String[] axu;

   private int charAt(String a , int index){
        if (index >= a.length()) {
            return -1;
        }
        return a.charAt(index);
    }

    public void sort(String[] input){
        int N = input.length;
        axu = new String[N];
        sort(input , 0 , N-1,  0);
    }

    public void sort(String[] input , int lo , int hi , int d){
        if (hi<=lo)
            return;

        int[] count= new int [R+2];

        for (int i = lo; i <=hi ; i++) {
            count[charAt(input[i],d)+2]++;
        }

        for (int i = 0; i < R+1; i++) {
            count[i+1] +=count[i];
        }

        for (int i = lo; i <=hi ; i++) {
            axu[count[charAt(input[i],d)+1]++] = input[i];
        }

        for (int j = lo; j <= hi; j++) {
            input[j] = axu[j-lo];
        }

        for (int i = 0; i < R ; i++) {
             sort(input , lo + count[i] , lo+ count[i+1]-1 , d+1);
        }

    }
}
