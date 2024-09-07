package com.aki.leetcodes.ArrayAndString;

import java.util.Arrays;

// LeetCode : 14
public class LongestCommonPrefix {

    public static String getLongestCommonPrefix(String[] strings) {

        StringBuilder ans = new StringBuilder() ;

        // Make strings -> has longest prefix string ..... has shortest prefix string
        Arrays.sort(strings) ;

        String firstString = strings[0] ;
        String lastString = strings[strings.length-1] ;
        int minLength = Math.min(firstString.length(), lastString.length()) ;

        for(int i = 0 ; i < minLength ; i ++) {

            if (firstString.charAt(i) != lastString.charAt(i)) {
                return ans.toString() ;
            }
            ans.append(firstString.charAt(i)) ;
        }

        return ans.toString() ;
    }

    public static void main(String[] args) {

        String[] strings1 = {"flower", "flow", "flight"} ;
        String[] strings2 = {"dog", "racecar", "car"} ;
        System.out.println("LongestCommonPrefix: [ " + getLongestCommonPrefix(strings1) + " ]");
        System.out.println("LongestCommonPrefix: [ " + getLongestCommonPrefix(strings2) + " ]");
    }
}
