package com.avinash.LPS;

import java.util.ArrayList;
import java.util.Collections;

public class LongestPalindromicSubsequence {


    public static void main(String[] args) {
        ArrayList<String> resList = findPalSubs("forgeeksskeegfor");
        resList.stream().forEach(r-> {
            System.out.println(r);
        });
    }

    static ArrayList<String> findPalSubs(String string) {
        String temp = "";
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < string.length() - 1; i++) { // for running loop for n times
            temp = ""; // reset temp list
            int k = 0;
            for (int  j = string.length() - 1; j >= 0 ; j--) {

                if (string.charAt(k) == string.charAt(j)) {
                    temp += string.charAt(k);
                    k++;
                } else {
                    if(!temp.equals(""))
                    resultList.add(temp);
                    break;
                }
            }
        }
        return resultList;
    }
}
