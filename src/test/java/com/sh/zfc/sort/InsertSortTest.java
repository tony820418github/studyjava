package com.sh.zfc.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {

    @Test
    public void sort() {
        Integer[] src = new Integer[]{5, 6, 1, 2};
        Integer[] exp = new Integer[]{1, 2, 5, 6};

        int[] actual;
        InsertSort ssort = new InsertSort();
        ssort.sort(src);
        assertArrayEquals(exp , src);

        src = new Integer[]{5, 6, 1, 2, 7, 3, 8, 4, 9, 0};
        exp = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ssort.sort(src);
        assertArrayEquals(exp, src);

        String[] srcchar = new String[]{"B","C","D","A"};
        String[] expchar = new String[]{"A","B","C","D"};
        ssort.sort(srcchar);
        assertArrayEquals(expchar, srcchar);
    }
}