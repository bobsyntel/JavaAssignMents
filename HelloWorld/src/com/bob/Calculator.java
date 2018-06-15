package com.bob;

public class Calculator {
    private int a;
    private int b;
      public Calculator(){

      }
      /*
     public static void main(String[] args){
         int sum = add(23,32);
     }

     */

    public int add(int a, int b){
        this.a = a;
        this.b = b;
        return this.a+ this.b;
    }
}
