package com.aki.leetcodes.MapAndSet;

import java.util.HashMap;
import java.util.Map;

// LeetCode : 383
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        // Count each chara in magazine
        Map<Character, Integer> magazineMap = new HashMap<>();

        for(char m : magazine.toCharArray()) {
            // Count ++
            magazineMap.put(m, magazineMap.getOrDefault(m, 0) + 1) ;
        }

        for(char r : ransomNote.toCharArray()) {

            // r is not in from start, or used completely
            if(!magazineMap.containsKey(r) || magazineMap.get(r) == 0) {
                return false ;
            }
            magazineMap.put(r, magazineMap.get(r) - 1) ;  // Count --
        }

        return true ;
    }

    public static void main(String[] args) {

        String ransomNote1 = "a" ;
        String magazine1 = "b" ;
        System.out.println(canConstruct(ransomNote1, magazine1));

        String ransomNote2 = "aa" ;
        String magazine2 = "ab" ;
        System.out.println(canConstruct(ransomNote2, magazine2));

        String ransomNote3 = "aa" ;
        String magazine3 = "aab" ;
        System.out.println(canConstruct(ransomNote3, magazine3));
    }
}
