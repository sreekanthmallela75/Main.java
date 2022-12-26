package com.Arraypractice;

public class RevOfString {
    public static void main(String[] args) {
        String name = "Sreekanth";
        String name1 = "";
        for (int i =8; i>=0; i--) {
            name1 = name.charAt(i) + name1;
            System.out.println(name1);
        }
    }
}
