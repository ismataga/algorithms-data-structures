package com.example.algorithmsdatastructures.Array;

public class Permutation {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,3,4,2,1};
        boolean a =permutation(array1, array2);
        System.out.println(a);
    }
    public static boolean permutation(int[] array1, int[] array2){
        // TODO
        if(array2.length!=array1.length||array1.length<1||array2.length<1){
            return false;
        }

        for(int i =0;i<array1.length-1;i++){
            for(int j =0;j<array1.length-2;j++){
                if(array1[j]>array1[j+1]){
                    int temp = array1[j];
                    array1[j]=array1[j+1];
                    array1[j+1]=temp;

                }
            }
        }

        for(int i =0;i<array2.length;i++){
            for(int j =0;j<array2.length-1;j++){
                if(array2[j]>array2[j+1]){
                    int temp = array2[j];
                    array2[j]=array2[j+1];
                    array2[j+1]=temp;
                }
            }
        }


        for (int i=0;i<array1.length-1 ;i++ ) {
            if(array1[i]!=array2[i]){
                return false;

            }
        }
        return true;
    }
}
