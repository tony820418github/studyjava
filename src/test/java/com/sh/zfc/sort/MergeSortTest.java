package com.sh.zfc.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        Integer[] src = new Integer[]{5, 6, 1, 2};
        Integer[] exp = new Integer[]{1, 2, 5, 6};

        Integer[] actual;
        MergeSort ssort = new MergeSort();
        actual = ssort.sort(src);
        assertArrayEquals(exp , actual);

        src = new Integer[]{5, 6, 1, 2, 7, 3, 8, 4, 9, 0,10};
        exp = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        actual = ssort.sort(src);
        assertArrayEquals(exp, actual);


    }

    @Test
    public void merge() {
    }
}