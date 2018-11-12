package com.sh.zfc.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamTest {
    static List<Dish> menu = Arrays.asList(
            new Dish(" pork", false, 800, Dish.Type.MEAT),
            new Dish(" beef", false, 700, Dish.Type.MEAT),
            new Dish(" chicken", false, 400, Dish.Type.MEAT),
            new Dish(" french fries", true, 530, Dish.Type.OTHER),
            new Dish(" rice", true, 350, Dish.Type.OTHER),
            new Dish(" season fruit", true, 120, Dish.Type.OTHER),
            new Dish(" pizza", true, 550, Dish.Type.OTHER),
            new Dish(" prawns", false, 300, Dish.Type.FISH),
            new Dish(" salmon", false, 450, Dish.Type.FISH));

    public static void main(String[] args) {
        List<String> threeNames = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());
        System.out.println(threeNames);

        String[] arrayOfWords = {"Goodbye","World"};
        List<String> words =  Arrays.asList("Java 8" , "Lambdas" , "In" , "Action");
        List<Stream<String>> uwords = words.stream()
                .map(word->word.split(""))
                .map(Arrays::stream)
                .distinct()
                .collect(toList());
        System.out.println(uwords);

        List<String> uchar = words.stream()
                .map(w->w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
        System.out.println(uchar);

        List<Integer> num1 = Arrays.asList(1,2,3);
        List<Integer> num2 = Arrays.asList(3,4);
        List<int[]> paris = num1.stream()
                .flatMap(i->num2.stream()
                .map(j->new int[]{i,j}))
                .collect(toList());
        

    }

}
