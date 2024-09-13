package com.aki.leetcodes.DynamicProgramming;

// LeetCode : 746
public class MinCostClimbingStairs {

    // Time : O(2 ^ n)
    // Space : O(n)
    public static int minCostClimbingStairsRecursionSolution(int[] cost) {

        int len = cost.length;

        return Math.min(minCost(cost, len - 1), minCost(cost, len - 2));
    }

    private static int minCost(int[] cost, int len) {

        if (len < 0) return 0 ;
        // Handle empty array or has only one element situation
        if (len == 0 || len == 1) return cost[len] ;

        return cost[len] +
               Math.min(minCost(cost, len - 1), minCost(cost, len - 2));
    }

    // Time : O(n)
    // Space : O(n)
    public static int dpMinCostClimbingStairsSolution(int[] cost) {

        int len = cost.length ;

        int[] dpArray = new int[len + 1] ;

        for(int i = 2 ; i <= len ; i++) {
            // The min cost of reaching ith stair
            dpArray[i] = Math.min(dpArray[i - 2] + cost[i - 2], dpArray[i - 1] + cost[i - 1]) ;
        }

        return dpArray[len] ;
    }


    public static void main(String[] args) {

        int[] costs1 = {10, 15, 20} ;
        System.out.println(minCostClimbingStairsRecursionSolution(costs1));
        System.out.println(dpMinCostClimbingStairsSolution(costs1));

        int[] costs2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1} ;
        System.out.println(minCostClimbingStairsRecursionSolution(costs2));
        System.out.println(dpMinCostClimbingStairsSolution(costs2));
    }
}
