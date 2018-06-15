package com.bob;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //width of float = 32(4 bytes)
        float myfloatvalue = 5f/3f;

        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d/3d;
        System.out.println(myDoubleValue);
        System.out.println(myfloatvalue);
        //byte is from -128 to 127
        byte m = (byte)(10/2);
        System.out.println(m);
    }
}
