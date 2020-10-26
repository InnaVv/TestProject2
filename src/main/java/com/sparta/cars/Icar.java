package com.sparta.cars;

public interface Icar {

    void doSomeJob();

    void doPrint(String text);

    default void commonMethod(){
        System.out.println(124);
    }
}
