package com.example.algorithmsdatastructures.Array;

import java.util.Arrays;

public class LeetCode121SellStock {

    public static Integer[] prices = {7, 1, 5, 3, 6, 4};

    public static void main(String[] args) {
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(Integer[] prices) {

        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            result[i] = prices[i];
        }

        int n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }


        int minValue = prices[0];


        int index = -1;

        for (int j = 0; j < result.length; j++) {
            if (result[j] == minValue) {
                index = j;
                break;
            }
        }


        int max = result[0];


        for (int i = 1; i < result.length; i++) {

            if (result[i] > max) {
                max = result[i];
            }
        }

        int startIndex = index;

        if (startIndex < 0 || startIndex >= result.length) {
            throw new IllegalArgumentException("Start index is out of bounds");
        }

        int maxNumber = result[startIndex];

        for (int i = startIndex + 1; i < result.length; i++) {
            if (result[i] > maxNumber) {
                maxNumber = result[i];
            }
        }
        return maxNumber - minValue;

    }

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
