package com.example.algorithmsdatastructures.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraysDataStore {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer[] numbers = {10, 15, 45, 46};

        double average = Arrays.stream(numbers)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);

        Arrays.stream(numbers)
                .filter(a -> a > average)
                .forEach(System.out::println);

    }

}
