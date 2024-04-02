package com.example.algorithmsdatastructures.arrayList;

import java.util.ArrayList;
import java.util.List;

public class PrintsPairs {
    public static void main(String[] args) {
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        pairs.add(1);
        pairs.add(2);
        pairs.add(3);
        pairs.add(4);
        for (int i = 0; i < pairs.size(); i++) {
            for (Integer pair : pairs) {
                System.out.println(pairs.get(i).toString() + pair.toString());
            }
        }
    }
}
