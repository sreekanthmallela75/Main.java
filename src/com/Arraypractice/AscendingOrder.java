package com.Arraypractice;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr ={23,56,78,86,99};
        System.out.println("The ascending order of an array is:");
        AscendingOrder ao = new AscendingOrder();
        ao.ascendingOrder(arr);
        ao.print(arr);
    }
    public void ascendingOrder(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){  //swapping of two variables
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
    }
    public void print(int[] arr){
        for  (int i : arr) {
            System.out.println(i);

        }

             {

        }

    }
}
