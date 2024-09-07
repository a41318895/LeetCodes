package com.aki.leetcodes.ArrayAndString;

// LeetCode : 2239
public class FindClosestNumberToZero {

    public static int solution(int[] array) {

        int tempAnswer = Integer.MAX_VALUE;

        for(int num : array) {

            if(Math.abs(num) <= Math.abs(tempAnswer) && Math.abs(num) != tempAnswer) {
                tempAnswer = num ;
            }
        }
        return tempAnswer ;
    }

    public static void main(String[] args) {

        int[] targetArray1 = {-4, -2, 1, 4, 8} ;
        int[] targetArray2 = {2, -1, 1} ;

        System.out.println(solution(targetArray1));
        System.out.println(solution(targetArray2));
    }
}
