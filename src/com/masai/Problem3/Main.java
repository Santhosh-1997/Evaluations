package com.masai.Problem3;

import java.util.Scanner;

public class Main {

    public static void printNumber(int a, int b, int c){

        for(int i=a; i<=b; i=i+c){
            System.out.print(i + " ");
        }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter the Starting number");
        a = input.nextInt();

        System.out.println("Enter the second number");
        b = input.nextInt();

        System.out.println("Enter the incremental value");
        c = input.nextInt();

        if(c<0 || b<a){
            System.out.println("Error");
        }
        //System.out.println(a+" "+b+" "+c);
        else {printNumber(a,b,c);}
    }


}
