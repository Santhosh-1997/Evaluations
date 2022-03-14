package com.masai.Problem2;

import java.util.Scanner;

public class stringManipulator {

    public String removeVowels(String input){

        if(input.length()==0){
            return "null";
        }

        String result="";

        for(int i=0; i<input.length(); i++){

            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            result = result + ch;
        }

        return result;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String");
        String string = input.nextLine();

        //System.out.println(string);
        stringManipulator obj = new stringManipulator();

        System.out.println(obj.removeVowels(string));

    }

}
