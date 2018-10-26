package com.sh.zfc.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectSortTest {

    @Test
    public void sort() {

        int[] src = new int[]{5, 6, 1, 2};
        int[] exp = new int[]{1, 2, 5, 6};

        int[] actual;
        SelectSort ssort = new SelectSort();
       actual = ssort.sort(src);
        assertArrayEquals(exp , actual);

        src = new int[]{5, 6, 1, 2, 7, 3, 8, 4, 9, 0};
        exp = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        actual = ssort.sort(src);
        assertArrayEquals(exp, actual);

    }
}