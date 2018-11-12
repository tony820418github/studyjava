package com.sh.zfc.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class Apple {
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    Integer weight;
    public Apple(int weight) {
        this.weight= weight;
        }

        public static List<Apple> map(List<Integer> list , Function<Integer , Apple> f){

            List<Apple> apples = new ArrayList<>();
            for (Integer weight:list) {
                apples.add(f.apply(weight));
            }
            return  apples;
        }

    public static void main(String[] args) {
        List<Integer> weight = Arrays.asList(6,5,2);

      //  Function<Integer , Apple> f =
        List<Apple> apples = map(weight , Apple::new);
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        apples.sort((o1,o2)->o1.getWeight().compareTo(o2.getWeight()));

        Comparator<Apple> c = Comparator.comparing((Apple a)->a.getWeight());

        apples.sort(Comparator.comparing((a)->a.getWeight()));

        apples.sort(Comparator.comparing(Apple::getWeight));
    }
}
