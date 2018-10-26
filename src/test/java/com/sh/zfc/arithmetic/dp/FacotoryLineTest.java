package com.sh.zfc.arithmetic.dp;

import static org.junit.Assert.*;

public class FacotoryLineTest {

    @org.junit.Test
    public void getShortest() {
        int num = 2;
        int[] z1 = { 1, 1};
        int[] t1 = { 1, 1};
        int r1 = 1;

        int[] z2 = {2, 2};
        int[] t2 = { 2, 2};
        int r2 = 2;
        FacotoryLine fl = new  FacotoryLine();
        assertEquals( 3 ,fl.getShortest(r1,z1,t1,r2,z2,t2,num) );
    }

    @org.junit.Test
    public void getShortest1() {
        int num = 2;
        int[] z1 = { 5, 1};
        int[] t1 = { 1, 1};
        int r1 = 1;

        int[] z2 = {2, 10};
        int[] t2 = { 1, 1};
        int r2 = 1;
        FacotoryLine fl = new  FacotoryLine();
        assertEquals( 5 ,fl.getShortest(r1,z1,t1,r2,z2,t2,num) );
    }

}