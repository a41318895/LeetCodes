package com.aki.leetcodes.MapAndSet;

// LeetCode : 242
public class ValidAnagram {

    public static boolean isAnagram(String originalString, String anagramedString) {

        // Ensure these two have the same length
        if (originalString.length() != anagramedString.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < originalString.length(); i++) {
            count[originalString.charAt(i) - 'a']++ ;   // Need i
            count[anagramedString.charAt(i) - 'a']-- ;  // Actually have i
        }

        // If exist two sides, that index should be 0 (+1 -1)
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String originalString = "anagram";
        String anagramedString = "nagaram";
        System.out.println(isAnagram(originalString, anagramedString));

        String originalString2 = "rat";
        String anagramedString2 = "car";
        System.out.println(isAnagram(originalString2, anagramedString2));
    }
}
