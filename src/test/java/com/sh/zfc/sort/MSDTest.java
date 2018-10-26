package com.sh.zfc.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MSDTest {

    @Test
    public void sout() {
//        String[] src = {"ccc", "abb", "aaa", "bba", "cbc", "abb","abc", "baa", "aab", "aac", "aba"};
//        String[] exp = {"aaa", "aab", "aac", "aba", "abb","abb", "abc", "baa", "bba", "cbc", "ccc"};
//
//        MSD ssort = new MSD();
//        ssort.sort(src);
//        assertArrayEquals(exp, src);

        String[] src1= {"abc", "cbc","abb",  "ab", "aaa", "ccc","a", "aa","baa", "bba", "aab" };
        String[] exp1 = {"a", "aa", "aaa", "aab", "ab","abb", "abc", "baa", "bba", "cbc", "ccc"};

        MSD ssort1 = new MSD();
        ssort1.sort(src1);
        assertArrayEquals(exp1, src1);
    }
}