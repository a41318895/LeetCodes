package com.aki.leetcodes.DynamicProgramming;

// LeetCode : 70
public class ClimbingStairs {

    // Time : O(2 ^ n)
    // Space : O(n)
    public static int climbStairsRecursionSolution(int n) {

        if (n == 0 || n == 1) return 1 ;

        return climbStairsRecursionSolution(n - 1) + climbStairsRecursionSolution(n - 2) ;
    }

    // Time : O(n)
    // Space : O(n)
    public static int dpClimbStairsSolution(int n) {

        if (n == 0 || n == 1) return 1 ;

        int[] dpArray = new int[n + 1] ;
        dpArray[0] = dpArray[1] = 1 ;

        for(int i = 2 ; i <= n ; i++) {
            dpArray[i] = dpArray[i - 1] + dpArray[i - 2] ;
        }

        return dpArray[n] ;
    }

    // Time : O(n)
    // Space : O(1)
    public static int swapClimbStairsSolution(int n) {

        if (n == 0 || n == 1) return 1 ;

        int preVal = 1, currentVal = 1 ;
        for(int i = 2 ; i <= n ; i ++) {
            int tempVal = currentVal ;
            currentVal = preVal + currentVal ;
            preVal = tempVal ;
        }

        return currentVal ;
    }

    public static void main(String[] args) {

        int n1 = 2 ;
        System.out.println(climbStairsRecursionSolution(n1));
        System.out.println(dpClimbStairsSolution(n1)) ;
        System.out.println(swapClimbStairsSolution(n1)) ;

        int n2 = 3 ;
        System.out.println(climbStairsRecursionSolution(n2));
        System.out.println(dpClimbStairsSolution(n2)) ;
        System.out.println(swapClimbStairsSolution(n2));
    }
}
