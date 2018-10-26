package com.sh.zfc.thinkinjava.chapter11;

import java.util.*;

public class ColletctionTest {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        List<Integer> al = new ArrayList<Integer>();
        List<Integer> ll = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();

        Map<String,String > map = new HashMap<>();

        Arrays.asList();
        Integer a = new Integer(1);
        System.out.println(a.hashCode());
    }
}
