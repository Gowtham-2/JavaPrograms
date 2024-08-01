package com.generics;
import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Double> list2=new ArrayList<>();
        List<Float> list3=new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list1.add(i);
            list2.add((double) i+1);
            list3.add((float)i+1);
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }
    public static void printList(List<?> list){
        System.out.println(list);
    }
}
