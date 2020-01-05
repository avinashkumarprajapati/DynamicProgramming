package com.avinash.LPS;

public class PalindromeChecker {
    static Boolean  isPalindrome(String string) {
        int i=0;
        Boolean ispalindrome =true;
        while (string.charAt(i) == string.charAt(string.length() - 1)) {
            ispalindrome=  isPalindrome(string.substring(1, string.length() - 1));
        }
        if (ispalindrome){return true;}

        return false;
    }

    public static void main(String[] args) {
        String string = "avinash";
        System.out.println(string.substring(1, string.length() - 1));
        System.out.println(string.charAt(string.length()-1));
        System.out.println(isPalindrome(string));
    }
}
