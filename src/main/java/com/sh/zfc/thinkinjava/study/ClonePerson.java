package com.sh.zfc.thinkinjava.study;

public class ClonePerson implements Cloneable {

    public int age = 0;
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "my age = " + age;
    }



    public static void main(String[] args) throws CloneNotSupportedException {
         ClonePerson c1 = new ClonePerson();
         c1.age = 1;
         ClonePerson c2 = (ClonePerson) c1.clone();
         c2.age = 2;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        int[][] a1 = {{1}};
        int[][] a2 = a1.clone();
        a2[0][0]=2;
        System.out.println(a1);
        System.out.println(a2);

    }
}
