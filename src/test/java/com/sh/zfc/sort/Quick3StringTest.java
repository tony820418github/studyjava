package com.sh.zfc.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class Quick3StringTest {

    @Test
    public void sort() {
        String[] src1= {"abc", "cbc","abb",  "ab", "aaa", "ccc","a", "aa","baa", "bba", "aab" };
        String[] exp1 = {"a", "aa", "aaa", "aab", "ab","abb", "abc", "baa", "bba", "cbc", "ccc"};

        Quick3String.sort(src1);
        assertArrayEquals(exp1, src1);
    }
}