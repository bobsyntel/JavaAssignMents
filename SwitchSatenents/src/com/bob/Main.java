package com.bob;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char switchValue = 'C';

        switch (switchValue){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value was "+switchValue);
                break;

            default:
                System.out.println("Not found");
        }
    }
}
