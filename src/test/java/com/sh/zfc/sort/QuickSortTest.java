package com.sh.zfc.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort() {
        Integer[] src = new Integer[]{5, 6, 1, 2};
        Integer[] exp = new Integer[]{1, 2, 5, 6};

        QuickSort sort = new QuickSort();
        sort.sort(src);
        assertArrayEquals(exp , src);

        src = new Integer[]{5, 6, 1, 2, 7, 3, 8, 5, 9, 0};
        exp = new Integer[]{0, 1, 2, 3, 5, 5, 6, 7, 8, 9};
        sort.sort(src);
        assertArrayEquals(exp, src);

        String[] srcchar = new String[]{"B","C","D","A"};
        String[] expchar = new String[]{"A","B","C","D"};
        sort.sort(srcchar);
        assertArrayEquals(expchar, srcchar);
    }
}