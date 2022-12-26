package com.Arraypractice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("The second largest no of an array is:");
        SecondLargest sl = new SecondLargest();
        sl.secondLargest(arr);

    }
    public void secondLargest(int[] arr){
        int second=0;
        for (int i=0; i<arr.length;i++){
            if (second<arr[i]){
                second=arr[i]-1;
            }
        }
        System.out.println(second+" ");
    }
}
