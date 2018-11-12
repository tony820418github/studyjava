package com.sh.zfc.lambda;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ReferenceTest {
    public static void main(String[] args) {
        int n = 3;
        Calculate calculate = param -> {
           // n=10;// 编译错误
            return n + param;
        };
        System.out.println(calculate.calculate(10));
        List<String> list = Stream.of("a","b").collect(toList());
    }

    @FunctionalInterface
    interface Calculate {
        int calculate(int value);
    }

}
