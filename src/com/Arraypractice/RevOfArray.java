package com.Arraypractice;

public class RevOfArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("The reverse of an array is:");
           RevOfArray rv= new RevOfArray();
           rv.reverseArray(arr);
    }
    public void reverseArray(int[] arr){
        for (int i= arr.length-1;i>=0;i--){

            System.out.print(arr[i]+" ");
        }


    }
}
