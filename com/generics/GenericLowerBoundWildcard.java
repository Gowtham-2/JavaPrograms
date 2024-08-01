package com.generics;

import java.util.Arrays;
import java.util.List;

public class GenericLowerBoundWildcard {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(10,20,30,40);
        printOnly(list1);

        List<Number> list2=Arrays.asList(10,20,30,40);
        printOnly(list2);

    }
    public static void printOnly(List<? super Integer> myList){
        System.out.println(myList);
    }
}
