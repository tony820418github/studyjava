package com.sh.zfc.arithmetic.dp;

public class CLS {

    String first = "ABCBDAB";
    String second = "BDCABA";

    int[][] c;
    int[][] b;

    public CLS(String first, String second) {
        this.first = first;
        this.second = second;
        int f = first.length();
        int s=second.length();
        c=new int[f+1][s+1];
        b=new int[f+1][s+1];
        for (int i = 0; i < f+1; i++) {
            for (int j = 0; j < s+1; j++) {
                c[i][j] = 0;
                b[i][j] =0;
            }
        }

    }

    public int[][] getCLS(){
        int f = first.length();
        int s=second.length();
        for (int i = 1; i < f+1; i++) {
            for (int j = 1; j < s+1; j++) {
                if (first.charAt(i-1) == second.charAt(j-1)) {
                    c[i][j] = c[i-1][j-1]+1;
                    b[i][j] = 3;
                }else {
                    if (c[i-1][j] >=c[i][j-1]){
                        c[i][j]=c[i-1][j];
                        b[i][j]=2;
                    }else {
                        c[i][j] = c[i][j-1];
                        b[i][j]=1;
                    }
                }
            }
        }
        return c ;
    }

    void printPath(String first , int m ,  int n){
        if (m == 0 || n == 0) {
            return;
        }
        if (b[m][n] == 3) {
            printPath(first , m-1 , n-1);
            System.out.println(first.charAt(m-1));
        }else {
            if (b[m][n] == 2) {
                 printPath(first, m - 1, n);
            }else{
                printPath(first, m , n-1);
            }
        }
    }

    public static void main(String[] args) {
        String first = "ABCBDAB";
        String second = "BDCABA";
        CLS cls = new  CLS( first,second );
        int [][] c= cls.getCLS();
        cls.printPath(first , first.length() , second.length());
        System.out.println(c[first.length()][second.length()]);

    }

}
