package com.generics;
public class GenericMethod {
    static <T> T printGeneric(T element){
        return element;
        //System.out.println(element);
    }
    public static void main(String[] args) {
        System.out.println(printGeneric("Generic Method"));
        System.out.println(printGeneric(1234));
    }
}
