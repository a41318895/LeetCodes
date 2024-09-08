package com.aki.leetcodes.TwoPointers;

import java.util.Arrays;

// LeetCode : 977
public class SquaresOfASortedArray {

    // Time : O(n log n)
    // Space : O (n log n)
    public static int[] sortedSquares(int[] nums) {

        return Arrays.stream(nums).map(num -> num * num).sorted().toArray() ;
    }

    // Time : O(n)
    // Space : O (n)
    public static int[] sortedSquaresUseTwoPointersOptimization(int[] nums) {

        int len = nums.length ;
        // result return
        int[] result = new int[len] ;

        // pointers in nums array
        int left = 0, right = len - 1 ;
        // index for adding element to result return
        int index = len - 1 ;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index--] = nums[left] * nums[left] ;
                left++ ;
            } else {
                result[index--] = nums[right] * nums[right] ;
                right-- ;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {-4, -1, 0, 3, 10} ;
        System.out.println(Arrays.toString(sortedSquares(nums1)));
        System.out.println(Arrays.toString(sortedSquaresUseTwoPointersOptimization(nums1)));
        int[] nums2 = {-7, -3, 2, 3, 11} ;
        System.out.println(Arrays.toString(sortedSquares(nums2)));
        System.out.println(Arrays.toString(sortedSquaresUseTwoPointersOptimization(nums2)));
    }
}
