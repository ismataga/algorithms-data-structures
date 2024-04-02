package com.example.algorithmsdatastructures.Array;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] intArray = {60, 20, 30, 40, 50};
        System.out.println(maxProduct(intArray));
    }


    public static String maxProduct(int[] intArray) {


        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - 2; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];

                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;


                }

            }


        }
        int a = intArray[intArray.length - 1];
        int b = intArray[intArray.length - 2];

        return "(" + a + "," + b + ")";
    }

}
