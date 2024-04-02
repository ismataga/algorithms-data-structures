package com.example.algorithmsdatastructures.Array;

public class FindNumberInArray {
    public int searchInArray(int[] intArray, int valueToSearch) {
        int a;
        for( a =0; a<intArray.length; a++){

            if(intArray[a]==valueToSearch){
                return a;
            }
        }
        return a;
    }

}
