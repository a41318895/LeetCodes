package com.aki.leetcodes.BinarySearch;

// LeetCode : 704
public class BinarySearch {

    public static int search(int[] nums, int target) {

        int leftPointer = 0, rightPointer = nums.length - 1 ;

        // The 'equals' condition is to handle the situation only the last one element exists
        while(leftPointer <= rightPointer) {

            int middlePointer = leftPointer + (rightPointer - leftPointer) / 2 ;

            if(nums[middlePointer] == target) return middlePointer ;

            if(nums[middlePointer] < target) {
                leftPointer = middlePointer + 1 ;   // Wait to the last one element only, left will cross the right
            } else {
                rightPointer = middlePointer - 1 ;  // The right here will also cross the left on the same logic
            }
        }

        return -1 ;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12} ;
        int target1 = 9 ;
        int target2 = 2 ;

        System.out.println(search(nums, target1));
        System.out.println(search(nums, target2));
    }
}
