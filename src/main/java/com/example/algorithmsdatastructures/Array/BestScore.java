package com.example.algorithmsdatastructures.Array;

import java.util.Arrays;
import java.util.Collections;

public class BestScore {

    static Integer[] array = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};


    public static void main(String[] args) {
//        System.out.println(Arrays.toString(findTopTwoScores(array)));
        System.out.println(Arrays.toString(findTopTwoScores(array)));
//        Arrays.sort(array, Collections.reverseOrder());
//
//        int biggest1 = array[0];
//        int biggest2 = array[1];
//
//        System.out.println("Biggest number: " + biggest1);
//        System.out.println("Second biggest number: " + biggest2);
    }

    public static Integer[] findTopTwoScores(Integer[] array) {
        return Arrays.stream(array)
                .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
                .limit(2)
                .toArray(Integer[]::new);
    }

    public static int[] findTopTwoScores(int[] array) {
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int[] a = new int[2];

        for (int num : array) {
            if (num > largest1) {
                largest2 = largest1;
                largest1 = num;
            } else if (num > largest2 && num != largest1) {
                largest2 = num;
            }

        }

        a[0] = largest2;
        a[1] = largest1;


        return a;

    }


}
