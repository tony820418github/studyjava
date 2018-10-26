package com.sh.zfc.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class KPMTest {

    @Test
    public void find() {
        String t = "ABCABCDHIJK";
        String p1 = "ABCE";
        String p2= "ABCD";
        int ac1 = KPM.find(t, p1);
        int ac2 = KPM.find(t,p2);
       // assertEquals(-1 , ac1);
        assertEquals(3 , ac2);
    }

    @Test
    public void getNext() {
        String p = "ABACDABABC";
        int[] exp = {-1,0,0,1,0,0,1,2,3,2};
        int[] act = KPM.getNext(p);
        assertArrayEquals(exp ,act);

    }
}