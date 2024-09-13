package com.aki.leetcodes.DynamicProgramming;

// LeetCode : 509
public class FibonacciNumber {

    // Time : O(2 ^ n)
    // Space : O(n)
    public static int fibRecursionSolution(int n) {

        if (n == 0) return 0 ;
        if (n == 1) return 1 ;

        return fibRecursionSolution(n-1) + fibRecursionSolution(n-2) ;
    }

    // Time : O(n)
    // Space : O(n)
    public static int dpFibSolution(int n) {

        if (n == 0) return 0 ;
        if (n == 1) return 1 ;

        // Initialization
        int[] dpArray = new int[n + 1] ;
        dpArray[0] = 0 ;
        dpArray[1] = 1 ;

        for(int i = 2 ; i <= n ; i++) {
            dpArray[i] = dpArray[i - 2] + dpArray[i - 1] ;
        }

        return dpArray[n] ;
    }


    public static void main(String[] args) {

        int n1 = 2 ;
        System.out.println(fibRecursionSolution(n1));
        System.out.println(dpFibSolution(n1));

        int n2 = 3 ;
        System.out.println(fibRecursionSolution(n2));
        System.out.println(dpFibSolution(n2));

        int n3 = 4 ;
        System.out.println(fibRecursionSolution(n3));
        System.out.println(dpFibSolution(n3));

    }
}
