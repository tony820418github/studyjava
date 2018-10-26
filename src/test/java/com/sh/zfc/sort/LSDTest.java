package com.sh.zfc.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class LSDTest {

    @Test
    public void sort() {
        String[] src = {"ccc", "abb", "aaa", "bba", "cbc", "abb","abc", "baa", "aab", "aac", "aba"};
        String[] exp = {"aaa", "aab", "aac", "aba", "abb","abb", "abc", "baa", "bba", "cbc", "ccc"};

        LSD ssort = new LSD();
        ssort.sort(src , 3);
        assertArrayEquals(exp, src);
    }
}