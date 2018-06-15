package com.bob;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    class OrdArray{
        private long[] a;
        private int nElems;

        public OrdArray(int max){
            a = new long[max];
            nElems = 0;
        }

        public int find(long searchKey){
            int lowerBound = 0;
            int upperBound = nElems;
            int curIn;

            while(true){
                curIn = (lowerBound + upperBound)/2;

                if(a[curIn] == searchKey){
                    return  curIn;
                }else if(lowerBound > upperBound){
                    return nElems;
                }else{
                    if(a[curIn] <searchKey) {
                        lowerBound = curIn + 1;
                    }
                    else{
                           upperBound = curIn - 1;
                        }
                    }
                }
            }
        }


}
