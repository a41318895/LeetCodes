package com.aki.leetcodes.TwoPointers;

// LeetCode : 125
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        if(s.isEmpty()) return true ;

        String preHandledStr = s.toLowerCase().replaceAll("[^a-z0-9]", "") ;

        int left = 0, right = preHandledStr.length() - 1 ;
        while(left < right) {
            if(preHandledStr.charAt(left) != preHandledStr.charAt(right)) return false ;

            left ++ ;
            right -- ;
        }

        return true ;
    }

    public static void main(String[] args) {

        String string1 = "A man, a plan, a canal: Panama" ;
        System.out.println(isPalindrome(string1));

        String string2 = "race a car";
        System.out.println(isPalindrome(string2));

        String string3 = " ";
        System.out.println(isPalindrome(string3));
    }
}
