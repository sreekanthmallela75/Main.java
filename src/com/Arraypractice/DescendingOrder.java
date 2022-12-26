package com.Arraypractice;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {19, 27, 38, 47, 85};
        System.out.println("The Descending order of an array is:");
        DescendingOrder.descendingOrder(arr);
        DescendingOrder.print(arr);

    }

    public static void descendingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];

                }
            }
        }
    }
    public  static void print(int[] arr){

             for (int i : arr) {
                 System.out.println(i);

             }

         {

        }
    }
}

