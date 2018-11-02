package com.sh.zfc.arithmetic.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class KMPTest {

    @Test
    public void getKMPNext() {
        String finder = "ababc";
        int [] expect = {0,0,0,1,2};
        KMP kmp = new KMP();
        int [] next= kmp.getKMPNext(finder);
        assertArrayEquals(expect,next);
    }

    @Test
    public void getFirstPosition() {
        String src = "abceefgababcababc";
        String sub = "ababc";
//       String src = "abcd";
//       String sub = "bc";
        int expect = 7;
        KMP kmp = new KMP();
        int actual = kmp.getFirstPosition(src,sub);
        assertEquals(expect,actual);
    }
}