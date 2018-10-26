package com.sh.zfc.thinkinjava.chaper7;

public class Sun extends Parent {
    @Override
    public void myName() {
        System.out.println("my Name is Sun!");
    }

    public static void main(String[] args) {
        Parent persin = new  Sun();
        persin.myName();
    }
}
