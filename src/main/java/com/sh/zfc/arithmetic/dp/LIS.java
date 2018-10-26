package com.sh.zfc.arithmetic.dp;

import java.util.ArrayList;
import java.util.Collections;

/*
实例一：最长递增子序列（Longest Increasing Subsequence）。
问题描述。给定长度为N的数组A，计算A的最长单调递增的子序列（不一定连续）。如给定数组A{5，6，7，1，2，8}，则A的LIS为{5，6，7，8}，长度为4.
 */
public class LIS {
    public ArrayList<Integer> LIS(int[] A) {
        int[] bitLisForA = new int[A.length];//存储每一位的最长子串的结果
        bitLisForA[0] = 1;

        int[] pozitionBitListForA = new int[A.length];//最长子串对应的前驱
        pozitionBitListForA[0] = -1;

        int result =1;
        int index = 0;
        for (int i = 1; i < A.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && bitLisForA[j] > max) {
                    max = bitLisForA[j];
                    pozitionBitListForA[i] = j;
                }
            }
            bitLisForA[i] = max +1;
            if(result < bitLisForA[i]) {
                result = bitLisForA[i];
                index = i;
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for(;index >=0; ) {
            res.add(A[index]);
            index = pozitionBitListForA[index];
        }
        Collections.reverse(res);
        return res;
    }

    public int LISforLength(int[] A) {
        int[] bitLisForA = new int[A.length];//存储每一位的最长子串的结果
        bitLisForA[0] = 1;

        int result =1;
        for (int i = 1; i < A.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && bitLisForA[j] > max) {
                    max = bitLisForA[j];
                }
            }
            bitLisForA[i] = max +1;
            result = Math.max(result, bitLisForA[i]);
        }
        return result;
    }


}
