package com.generics;

interface DemoInterface<T1,T2>{
    T1 doSomeOperation(T1 t);
    T2 doReverseOperation(T2 t);
}
class GenericInterface implements DemoInterface<String,Integer>{
    @Override
    public String doSomeOperation(String t) {
        return t;
    }

    @Override
    public Integer doReverseOperation(Integer t) {
        return t;
    }

    public static void main(String[] args) {
        GenericInterface obj=new GenericInterface();
        System.out.println(obj.doSomeOperation("GenericInterface"));
        System.out.println(obj.doReverseOperation(1223));
    }
}
