package com.example.algorithmsdatastructures.Array;

import java.util.Arrays;

public class RemoveDuplicated {
    public class Exercise {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0 || nums.length == 1) {
                return nums.length;
            }
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            Arrays.copyOf(nums, i + 1);

            return   i+1;
        }


    }
}
