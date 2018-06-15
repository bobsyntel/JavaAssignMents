package com.bob;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 1/0;
        System.out.println(a);
        if(isEvenNumber(5)){
            System.out.println("This is an even number ");
        }else{
            System.out.println("This is an odd number");
        }
    }

    public static  boolean isEvenNumber(int num){

        if(num % 2 == 0)
            return true;
        return false;
    }
    }

