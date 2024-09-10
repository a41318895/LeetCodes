package com.aki.leetcodes.SlidingWindow;

// LeetCode : 643
public class MaximumAverageSubarrayI {

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static double findMaxAverage(int[] nums, int k) {

        int maxSum = 0 ;

        // The first sum init
        for(int i = 0 ; i < k ; i++) {
            maxSum += nums[i] ;
        }

        int currentSum = maxSum ;
        for(int j = k ; j < nums.length ; j ++) {      // Iterate the elements subarray haven't reached.

            currentSum += nums[j] - nums[j-k] ;     // The diff of nums[j] and num[j-k] means : the variation of sum with moving.

            if(currentSum > maxSum) maxSum = currentSum ;
        }

        return (double) maxSum / k ;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 12, -5, -6, 50, 3} ;
        int k1 = 4 ;
        System.out.println(findMaxAverage(nums1, k1));

        int[] nums2 = {5} ;
        int k2 = 1 ;
        System.out.println(findMaxAverage(nums2, k2));
    }
}
