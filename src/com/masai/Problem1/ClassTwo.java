package com.masai.Problem1;

public class ClassTwo extends ClassOne{
    @Override
    public void methodOne() {
        System.out.println("Inside methodOne of ClassTwo");
    }

    @Override
    public void methodTwo() {
        System.out.println("Inside methodTwo of classTwo");
    }

    @Override
    public String toString(){
        return "This is a ClassTwo object";
    }
}
