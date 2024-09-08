package com.aki.leetcodes.TwoPointers;

import java.util.Arrays;

// LeetCode : 344
public class ReverseString {

    // Time : O(n)
    // Space : O(1)
    public static void reverseString(char[] s) {

        char temp ;
        int pointer = 0 ;

        for(int i = s.length - 1 ; i > s.length / 2 ; i--) {

            if(i <= pointer) break ;

            temp = s[i] ;
            s[i] = s[pointer] ;
            s[pointer++] = temp ;
        }

        System.out.println(Arrays.toString(s)) ;
    }

    // Time : O(n)
    // Space : O(1)
    // This is more intuitive
    public static void reverseStringOptimized(char[] s) {

        int left = 0, right = s.length - 1 ;

        // When ( left == right ) or ( left > right ), it indicates that they met
        while(left < right) {

            char temp = s[left] ;
            s[left] = s[right] ;
            s[right] = temp ;

            left ++ ;
            right -- ;
        }

        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {

        char[] chars1 = {'h', 'e', 'l', 'l', 'o'} ;
        //reverseString(chars1);
        reverseStringOptimized(chars1);

        char[] chars2 = {'H', 'a', 'n', 'n', 'a', 'h'} ;
        //reverseString(chars2);
        reverseStringOptimized(chars2);
    }
}
