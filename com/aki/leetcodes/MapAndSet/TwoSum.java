package com.aki.leetcodes.MapAndSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LeetCode : 1
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> valueAndIndex = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++) {

            int difference = target - nums[i] ;
            if(valueAndIndex.containsKey(difference)) {
                return new int[] {valueAndIndex.get(difference), i} ;
            }

            valueAndIndex.put(nums[i], i) ;
        }

        return new int[] {-1, -1} ;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15} ;
        int target1 = 9 ;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = {3, 2, 4} ;
        int target2 = 6 ;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

        int[] nums3 = {3, 3} ;
        int target3 = 6 ;
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }
}
