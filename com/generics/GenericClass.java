package com.generics;
//generic type class
public class GenericClass<T> {
    private T thing;
    public T getThing(){
        return thing;
    }
    public void setThing(T thing){
        this.thing=thing;
    }

    public static void main(String[] args) {
        GenericClass<String> book = new GenericClass<>();
        book.setThing("clean code");
        System.out.println(book.getThing());
        GenericClass<Integer> price = new GenericClass<>();
        price.setThing(790);
        System.out.println(price.getThing());
    }
}
