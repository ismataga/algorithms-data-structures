package com.example.algorithmsdatastructures.Array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    static int[] array ={1, 7, 2, 2, 3, 4, 7};

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(removeDuplicates(array)));
        System.out.println(Arrays.toString(removeDuplicatesa(array)));
    }
    public static int[] removeDuplicates(int[] arr) {

        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return Arrays.copyOf(arr, i + 1);
    }
    public static int[] removeDuplicatesa(int[] nums) {



        // Sort the array to group duplicates together
        Arrays.sort(nums);

        // Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array with unique elements
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                uniqueArray[index++] = nums[i];
            }
        }

        return uniqueArray;
    }


}