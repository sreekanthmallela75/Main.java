package com.Arraypractice;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {11, 78, 87, 99, 35};
        System.out.println("The third largest number in the array is:");
        thirdLargest(arr);

    }

    public static void thirdLargest(int[] arr) {

        // Find first largest element
        int first = arr[0];
        int second = arr[0];
        int third = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];

            } else if (arr[i] > third) {
                third = arr[i];

            }
        }
        System.out.println("First max number is:"+ first);
        System.out.println("second max number is:"+ second);
        System.out.println("third max number is:"+ third);


    }




}