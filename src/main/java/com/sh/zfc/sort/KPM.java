package com.sh.zfc.sort;

public class KPM {
    public static int find(String src , String mode){
        char[] t = src.toCharArray();
        char[] p = mode.toCharArray();
        int tl = src.length();
        int pl = mode.length();
        int i =0;
        int j  = 0;
        int next[] = getNext(src);
        while (i <tl && j<pl){

            if (j == -1 || t[i] == p[j]) {
                i++;
                j++;
            }else {
                //在有next  时， 可以不回退i
//                i = i-j +1;
//                j = 0;
                j = next[j];
            }

        }

        if (j == pl) {
            return i -j ;
        }else {
            return  -1;
        }

    }

    public static int[] getNext(String src){
        char[] p= src.toCharArray();
        int[] next = new  int[src.length()];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while ( j < p.length - 1){
            if (k == -1 || p[j] == p[k]) {
                next[++j] = ++k;
            }else {
                k = next[k];
            }
        }
        return next;
    }

}
