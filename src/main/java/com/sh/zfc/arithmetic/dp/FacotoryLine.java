package com.sh.zfc.arithmetic.dp;

public class FacotoryLine {

    public static final int num = 10;
    private int[] z1 = new int[num];
    private int[] t1 = new int[num];

    private int r1;   //
    private int r2;

    private int[] z2 = new int[num];
    private int[] t2 = new int[num];

    public int getShortest(int r1,int [] z1,int [] t1,int r2,int[]z2,int [] t2 , int num){

        int [] time1= new int[num];
        int [] time2 = new int[num];

        time1[0]= r1+z1[0];
        time2[0] =r2+z2[0];

        for (int i = 1; i < num; i++) {
           time1[i] = Math.min(time1[i-1] + z1[i], time2[i-1] + t2[i-1]+ z1[i]);
           time2[i] = Math.min(time2[i-1] + z2[i], time1[i-1] + t1[i-1]+ z2[i]);
        }

        int shortest = Math.min(time1[num-1] , time2[num-1]);

        printThePath(shortest , time1[num-1] , time2[num-1] , num);

        return shortest;
    }

    public void printThePath(int min , int lineTime1 , int lineTime2 , int stattion){
        if (stattion == 1) {
            System.out.println("Station = " +  stattion);
        }

        if (min == lineTime1) {
            System.out.println("Line = " + 1);

        }else {
            System.out.println("Line = " + 2);
        }


    }

    public static void main(String[] args) {

    }
}
