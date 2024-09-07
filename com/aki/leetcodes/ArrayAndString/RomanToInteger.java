package com.aki.leetcodes.ArrayAndString;

import java.util.HashMap;
import java.util.Map;

// LeetCode : 13
public class RomanToInteger {

    public static int romanToIntegerUseSwitch(String romanString) {

        int total = 0 ;
        int currentNum = 0 ;
        int prevNum = 0 ;

        for(int i = romanString.length() - 1 ; i >= 0 ; i --) {
            switch (romanString.charAt(i)) {
                case 'M' -> currentNum = 1000 ;
                case 'D' -> currentNum = 500 ;
                case 'C' -> currentNum = 100 ;
                case 'L' -> currentNum = 50 ;
                case 'X' -> currentNum = 10 ;
                case 'V' -> currentNum = 5 ;
                case 'I' -> currentNum = 1 ;
            }
            if(currentNum < prevNum) {
                total -= currentNum ;
            } else {
                total += currentNum ;
            }
            prevNum = currentNum ;
        }

        return total ;
    }

    public static int romanToIntegerUseMap(String romanString) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000) ;
        map.put('D', 500) ;
        map.put('C', 100) ;
        map.put('L', 50) ;
        map.put('X', 10) ;
        map.put('V', 5) ;
        map.put('I', 1) ;

        int total = 0 ;
        int prevNum = 0 ;
        for(int i = romanString.length() - 1 ; i >= 0 ; i --) {
            int currentNum = map.get(romanString.charAt(i)) ;
            if(currentNum < prevNum) {
                total -= currentNum ;
            } else {
                total += currentNum ;
            }
            prevNum = currentNum ;
        }

        return total ;
    }

    public static void main(String[] args) {

        String romanString1 = "III" ;
        String romanString2 = "LVIII" ;
        String romanString3 = "MCMXCIV" ;

        System.out.println(romanToIntegerUseMap(romanString1) + ", " + romanToIntegerUseMap(romanString2) + ", " + romanToIntegerUseMap(romanString3));
        System.out.println(romanToIntegerUseSwitch(romanString1) + ", " + romanToIntegerUseSwitch(romanString2) + ", " + romanToIntegerUseSwitch(romanString3));
    }
}
