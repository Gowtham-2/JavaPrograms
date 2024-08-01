package com.generics;
import java.util.*;

public class GenericsExample {
    public static void main(String[] args) {
        System.out.println("List implementation without generics:");
        //list implementation without generics
        List bestDesserts= new ArrayList();
        bestDesserts.add("PanCake");
        bestDesserts.add(1234);
        for (Object obj:bestDesserts) {
            try {
                String myDessert = (String) obj;
                System.out.println(myDessert);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("List implementation with generics:");
        //list implementation with generics
        List<String> desserts=new ArrayList<>();
        desserts.add("pancake");
        desserts.add("affogato");
        for (String s:desserts) {
            System.out.println(s);
        }
    }
}
