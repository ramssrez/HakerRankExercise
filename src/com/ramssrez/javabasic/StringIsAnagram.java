package com.ramssrez.javabasic;

import java.util.Scanner;
//Detect if two strings are anagrams
public class StringIsAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String str1, String str2) {
        //Create a vector, for count the number of character that repeat in each string
        int [] characterTotal = new int[26];
        //Declarate string for only use lower characters
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //If the strings have an empty space, it is remplace with null
        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");
        //In this for, used to found the position of the character, and increase one in the position
        for (int i = 0; i < str1.length(); i++) {
            characterTotal[str1.charAt(i) - 'a']++;
        }
        //In this for, used to found the position of the character, and decrease one in the position
        for (int i = 0; i < str2.length(); i++) {
            characterTotal[str2.charAt(i) - 'a']--;
        }
        //In this case use for check if, there are one character different to cero
        for (int character:characterTotal) {
            if(character != 0){
                return false;
            }
        }
        return true;
    }
}
