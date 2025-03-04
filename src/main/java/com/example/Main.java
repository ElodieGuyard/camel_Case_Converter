package com.example;


public class Main {

    public static void main(String[] args) {

        System.out.println(toCamelCase("hello_World")) ;
    }

    public static String toCamelCase(String s){

        // convert the input string in array of chars `char[]`
        char[] charArr = s.toCharArray();
        char underscore = '_';
        char dash = '-';

//     Debug : iterate `charArr[]` with for loop
//    for (char ch : charArr) {
//      System.out.print(ch);
//    }

        for (int i = 0; i < s.length() - 1; i++) {
            int j = i + 1;

            if (charArr[i] == underscore || charArr[i] == dash) {
                charArr[j] = Character.toUpperCase(charArr[j]);
            }
        }

        String newCamelString = new String(charArr);
        // replace all occurrences of the pattern in the input string
        newCamelString = newCamelString.replaceAll("[^a-zA-Z]", "");

        return newCamelString;
    }
}
