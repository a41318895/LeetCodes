package com.aki.leetcodes.MapAndSet;

// LeetCode : 1189
public class MaximumNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {

        // If length less than 7, it can't be formed to word 'balloon'
        if (text.length() < 7) return 0 ;

        int countB = 0, countA = 0, countL = 0, countO = 0, countN = 0 ;
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b' -> ++countB ;
                case 'a' -> ++countA ;
                case 'l' -> ++countL ;
                case 'o' -> ++countO ;
                case 'n' -> ++countN ;
            }
        }

        return Math.min(Math.min(Math.min(countB, countA), countN),
                        Math.min(countL / 2, countO / 2)) ;
    }

    public static void main(String[] args) {

        String text1 = "nlaebolko" ;
        String text2 = "loonbalxballpoon" ;
        String text3 = "leetcode" ;
        String text4 = "car" ;

        System.out.println(maxNumberOfBalloons(text1));
        System.out.println(maxNumberOfBalloons(text2));
        System.out.println(maxNumberOfBalloons(text3));
        System.out.println(maxNumberOfBalloons(text4));
    }
}
