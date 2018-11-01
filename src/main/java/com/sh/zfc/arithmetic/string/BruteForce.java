package com.sh.zfc.arithmetic.string;
/*
* 字符串暴力查找法
* 原字符串长度假设为M, 子字符串长度为N
* 算法时间复杂度为O(M*N),空间复杂度为O(1)
* 子字符串第一个字每与原字符串从头依次比较，如果相同，进行第二个字母比较，如果不同，继续与第一个字母比较
*/
public class BruteForce {
    public static  int getFirstPosition(String src , String sub){
        for (int i = 0; i <= src.length()-sub.length(); i++) {
            for (int j = 0; j < sub.length(); j++) {
                if (src.charAt(i+j) != sub.charAt(j)) {
                    break;
                }
                if (j == sub.length()-1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String src = "you are my over lover;";
        String sub = "lover";
        int index = BruteForce.getFirstPosition(src,sub);//返回16
        System.out.println(index);//
    }
}
