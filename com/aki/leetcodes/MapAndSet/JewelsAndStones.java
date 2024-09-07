package com.aki.leetcodes.MapAndSet;

import java.util.HashSet;
import java.util.Set;

// LeetCode : 771
public class JewelsAndStones {

    // Time : O(n + m * 1)
    // Space : O(m)
    public static int numJewelsInStonesLowTimeComplexity(String jewels, String stones) {

        // Because jewels are unique
        Set<Character> jewelSet = new HashSet<>();
        for(char j : jewels.toCharArray()) {
            jewelSet.add(j) ;
        }

        int jewelCount = 0 ;
        for(char s : stones.toCharArray()) {

           if(jewelSet.contains(s)) jewelCount++ ;
        }

        return jewelCount ;
    }

    // Time : O(n * m)
    // Space : O(1)
    public static int numJewelsInStonesLowSpaceComplexity(String jewels, String stones) {

        int jewelCount = 0 ;
        for(char s : stones.toCharArray()) {
            if(jewels.indexOf(s) != -1) jewelCount++ ;
        }

        return jewelCount ;
    }

    public static void main(String[] args) {

        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println(numJewelsInStonesLowTimeComplexity(jewels1, stones1));

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println(numJewelsInStonesLowSpaceComplexity(jewels2, stones2));
    }
}
