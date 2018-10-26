package com.sh.zfc.sort;

public class Quick3String {

    private static int chartAt(String s , int d){
        if (d<s.length())
            return s.charAt(d);
        else
            return -1;
    }

    public static void sort(String[] a){
        sort(a, 0 ,a.length-1,0);
    }

    private static void sort(String[] a, int lo, int hi, int d) {
        if (hi <= lo ) {
            return;
        }

        int lt=lo;
        int gt=hi;
        int v = chartAt(a[lo] , d);
        int i = lo +1;

        while (i <= gt){
            int t = chartAt(a[i],d);
            if (t<v ) SortUtil.exchange(a , lt ++ , i++);
            else if (t>v) SortUtil.exchange(a , i , gt--);
            else i++;
        }

        sort(a,lo,lt-1 , d);
        if (v>=0) sort(a,lt,gt,d+1);
        sort(a,gt+1,hi ,d);
    }


}
