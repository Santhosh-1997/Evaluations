package com.masai.Problem1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        InterfaceThree i3 = new ClassTwo();
        System.out.println(i3.toString());
        i3.methodOne();
        i3.methodTwo();
        i3.methodThree();

        System.out.println();

        InterfaceOne i1 = new ClassTwo();
        i1.methodOne();
        ClassTwo c2 = (ClassTwo) i1;
        c2.methodTwo();
        c2.methodThree();


    }
}
