package com.Arraypractice;

public class Largest {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("The second largest no of array is:");
        Largest.Largest(arr);
    }

    public static void Largest(int[] arr) {
        int Largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Largest < arr[i]) ;
            Largest = arr[i] ;
        }
        System.out.println(Largest + " ");
    }
}