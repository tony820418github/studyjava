package com.sh.zfc.arithmetic.string;

/*
看毛片算法,zfc1
zfc2
 */
public class KMP {

    public int getFirstPosition(String src , String sub){
        int srcLen = src.length();
        int subLen = sub.length();
        int[] next = getKMPNext(sub);
        int srcInte = 0;
        int subInte = 0;
        while (srcInte<srcLen){
            while (subInte < subLen){
                if (src.charAt(srcInte) != sub.charAt(subInte)) {
                    subInte = next[subInte];
                    if (subInte == -1) {
                        srcInte++;
                        subInte++;
                        break;
                    }
                }else {
                    subInte++;
                    srcInte++;
                }
            }
            if (subInte == subLen) {
                return srcInte-subLen;
            }
        }
        return -1;
    }





    /*
计算给定字串的next数组
 */
    public int[] getKMPNext(String finder) {
        int finderLen = finder.length();
        int[] next = new int[finderLen];
        next[0]= -1 ;
        for (int i = 1; i < finderLen; i++) {
            for (int j = i-1; j > 0; j--) {
                String qianzhui = finder.substring(0,j);
                String houzhui = finder.substring(i-j,i);
                if (qianzhui.equals(houzhui)) {
                    next[i] = j;
                    break;
                }
                next[i] = 0;
            }
        }
        return next;
    }

}
