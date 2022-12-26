package com.string;

public class CountPunctuations {
    public static void main(String[] args) {
        CountPunctuations.countPunctuations();
    }


    public static void countPunctuations() {
        //Stores the count of punctuation marks
        int count = 0;
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
        for (int i = 0; i < str.length(); i++) {
            //Checks whether given character is punctuation mark
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
                count++;
            }
        }
    }
}
