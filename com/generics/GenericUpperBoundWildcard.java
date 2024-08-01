package com.generics;
import java.util.ArrayList;
import java.util.List;

public class GenericUpperBoundWildcard {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Double> list2=new ArrayList<>();
        List<Float> list3=new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list1.add(i);
            list2.add((double) i+1);
            list3.add((float)i+1);
        }
        System.out.println(sumList(list1));
        System.out.println(sumList(list2));
        System.out.println(sumList(list3));
    }
    public static double sumList(List<? extends Number> myList){
        double sum=0.0;
        for (Number iterator:myList){
            sum+=iterator.doubleValue();
        }
        return sum;
    }
}
