package com.aki.leetcodes.ArrayAndString;

// LeetCode : 1768
public class MergeStringsAlternately {

    public static String solution(String string1, String string2) {

        StringBuilder answer = new StringBuilder();
        int maxStringLength = Math.max(string1.length(), string2.length()) ;

        for(int i = 0 ; i < maxStringLength ; i ++) {

            if(i < string1.length()) answer.append(string1.charAt(i)) ;
            if(i < string2.length()) answer.append(string2.charAt(i)) ;
        }

        return answer.toString() ;
    }

    public static void main(String[] args) {

        System.out.println(solution("abc", "pqr")) ;

        System.out.println(solution("ab", "pqrs")) ;

        System.out.println(solution("abcd", "pq")) ;
    }
}
