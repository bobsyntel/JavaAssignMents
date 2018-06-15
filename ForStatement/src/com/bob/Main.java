package com.bob;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        for(int i = 2; i <= 9;i++){
            if(IsPrime(i)){
                count++;
                System.out.println(i + " is a prime number");
            }

            if(count == 3){
                break;
            }
        }
    }

    public static boolean IsPrime(int number){
        if(number == 1)
            return false;

        for(int n = 2; n <= number/2; n++){
            if(number % n == 0){
                return false;
            }
        }
        return true;
    }
}
