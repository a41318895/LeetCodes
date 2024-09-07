package com.aki.leetcodes.ArrayAndString;

// LeetCode : 392
public class IsSubsequence {

    public static boolean isSubsequence(String subsequence, String totalString) {

        if(subsequence.isEmpty()) return true ;
        if(totalString.isEmpty()) return false ;

        int subsequenceCharAtCount = 0 ;

        for(int i = 0 ; i < totalString.length() ; i ++) {

            if(totalString.charAt(i) == subsequence.charAt(subsequenceCharAtCount)) {
                subsequenceCharAtCount ++ ;
            }
            if(subsequenceCharAtCount == subsequence.length()) {
                return true ;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "abc" ;
        String t1 = "ahbgdc" ;
        System.out.println(isSubsequence(s1, t1));
        String s2 = "axc" ;
        String t2 = "ahbgdc" ;
        System.out.println(isSubsequence(s2, t2));
    }
}
