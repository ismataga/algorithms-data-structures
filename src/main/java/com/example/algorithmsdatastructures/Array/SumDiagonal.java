package com.example.algorithmsdatastructures.Array;

public class SumDiagonal {

    static int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        System.out.println(sumDiagonalElements(array));
    }

    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < i+1; j++) {
                System.out.println(array[i][j]);
                sum += array[i][j];
            }
        }
        return sum;
    }
}
