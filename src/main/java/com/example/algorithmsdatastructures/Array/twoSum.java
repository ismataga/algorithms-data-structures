package com.example.algorithmsdatastructures.Array;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
      int[]  nums = {2,7,11,15};
        int[] a = twoSum(nums,9);
        System.out.println(Arrays.toString(a));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    arr[0]=nums[i];
                    arr[1]=nums[j];
                }

            }
        }
        return arr;
    }
}
