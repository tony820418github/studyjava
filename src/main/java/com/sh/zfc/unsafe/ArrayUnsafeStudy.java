package com.sh.zfc.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ArrayUnsafeStudy {
     static Unsafe u = null;

    public static void getUnsafe2() throws Throwable {
        Constructor<Unsafe> constructor = Unsafe.class.getDeclaredConstructor(new Class<?>[0]);
        constructor.setAccessible(true);
        u = constructor.newInstance(new Object[0]);
    }

    public static void main(String[] args) throws Throwable {
        getUnsafe2();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int b=u.arrayBaseOffset(int[].class);
        int ss= u.arrayIndexScale(int[].class);

        u.putInt(arr,(long)b+ss*9 , 1);
        for (int i = 0; i <10 ; i++) {
            int v = u.getInt(arr,b+ss*i);
            //System.out.println(v);
        }

        MyClass mc = (MyClass) u.allocateInstance(MyClass.class);
        long b1 = u.objectFieldOffset(MyClass.class.getDeclaredField("intfield"));
        u.putInt(mc , b1, 2);
        System.out.println(mc.intfield);


        String s = "abc";
        s.intern();
        String s1 = "abc";
        Field valueInString = String.class.getDeclaredField("value");
        long offset = u.objectFieldOffset(valueInString);
        long base = u.arrayBaseOffset(char[].class);
        long scale = u.arrayIndexScale(char[].class);
        char[] values = (char[]) u.getObject(s, offset);
        u.putChar(values, base + scale, 'c');
        System.out.println("s:"+s+" s1:"+s1);
        s = "abc";
        String s2 = "abc";
        String s3 = "abc";
        System.out.println("s:"+s+" s1:"+s1);
        System.out.println("s2:"+s2+" s3:"+s3);
    }
}
