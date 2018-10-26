package com.sh.zfc.unsafe;

public class MyClass {
    public int intfield;
    public static int staticIntfield;
    public static int[] arr;

    private MyClass() {
        System.out.println("myclass");
    }
}
