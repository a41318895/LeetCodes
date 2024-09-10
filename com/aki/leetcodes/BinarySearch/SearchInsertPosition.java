package com.aki.leetcodes.BinarySearch;

// LeetCode : 35
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int leftPointer = 0, rightPointer = nums.length - 1 ;

        while (leftPointer <= rightPointer) {

            int middlePointer = leftPointer + (rightPointer - leftPointer) / 2;

            if (nums[middlePointer] == target) return middlePointer;

            if (nums[middlePointer] > target) {

                rightPointer = middlePointer - 1;   // If target less than array[0], right == -1, left == 0 (insert)
            } else {
                leftPointer = middlePointer + 1;    // If target bigger than array[len - 1], right == len - 1, left == len (insert)
            }
        }

        return leftPointer;     // So, jumped out the loop, it should return leftPointer which represent the index inserted
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6} ;

        int target1 = 5 ;
        System.out.println(searchInsert(nums, target1));

        int target2 = 2 ;
        System.out.println(searchInsert(nums, target2));

        int target3 = 7 ;
        System.out.println(searchInsert(nums, target3));

    }
}
