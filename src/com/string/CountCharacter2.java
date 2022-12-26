package com.string;

public class CountCharacter2 {
    public static void main(String[] args) {
     CountCharacter2.countCharacter2();

    }
public static void countCharacter2(){
            String s1 = "Welcome to Noteshacker";
            String s2 = "Noteshacker is the best Website";
            int count1 = 0, count2 = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != ' ') {
                    count1 = count1 + 1;
                }

            }
            System.out.println("Character count of String s1:" + count1);
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) != ' ') {
                    count2 = count2 + 1;
                }

            }
            System.out.println("Character count of String s1:" + count2);
            if (count1 > count2) {
                System.out.println(s1 + "String 1 is Greater");
            } else
                System.out.println(s2 + " String 2 is greater");
        }
    }


//Stores the count of punctuation marks
           /* int count = 0;
            String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
            for (int i = 0; i < str.length(); i++)
            {
//Checks whether given character is punctuation mark
                if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                        str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
                {
                    count++;
                }
            }
            System.out.println("The number of punctuations exists in the string is: " +count);
        }
    }
        }*/