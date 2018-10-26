package com.sh.zfc.jvm;

public class CompileConstant {
    public static void main(String[] args) {
        System.out.println(Test.a);
        System.out.println(Test.c);
 //       String s = new String("abc");

//
//        String str2 = new String("str")  +"01";
//        String str3 = new String("str")  +"01";
//        str3.intern();
//        String str1 = "str01";
//        System.out.println(str2==str1); //false
//        System.out.println(str2==str3); //false
        String s1 = "abc";
        String s2 = new StringBuilder("ab").append("c").toString();
        System.out.println(s2 == s2.intern());

        String s3= s2.intern();
        String s4="abc";
        System.out.println(s2 == s2.intern());
        System.out.println(s1==s2); //false
        System.out.println(s1 == s3); //true
        System.out.println(s1 == s4); //true


//        String s2 = new String("abc");
//        String s3= s2.intern();
//        String s4="abc";
//        System.out.println(s3==s2); //false
//        System.out.println(s4 == s3); //true

//        String s2 = new String("abc");
//        String s3= s2.intern();
//        String s4=new String("abc");
//        String s5= s4.intern();
//        System.out.println(s4==s3); //false
//        System.out.println(s5 == s3); //true


        String str11 = new  StringBuilder("计算机你好").append("软件").toString();
        System.out.println(str11.intern() == str11);
    }
}
class Test {
    static {
        System.out.println("Class Test Was Loaded !");
        System.out.println(Test.c);

    }
    public static final int a =10;
    public static final int c = "test".length();
}
