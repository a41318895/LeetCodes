package com.aki.leetcodes.MapAndSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LeetCode : 169
public class MajorityElement {

    // Using HashMap
    // Time : O(n)
    // Space : O(n)
    public static int majorityElementUseHashMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > nums.length / 2) return entry.getKey();
        }

        throw new IllegalArgumentException("No any majority element found !");
    }

    // Using Arrays Sorting
    // Time : O(n log n)
    // Space : O(1)
    public static int majorityElementUseSorting(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length ;
        return nums[n / 2] ;

    }

    // Moore Voting Algorithm
    // Time : O(n)
    // Space : O(1)
    public static int majorityElementUseMooreVotingAlgorithm(int[] nums) {

        int majorityCount = 0 ;
        int comparedCandidate = 0 ;

        for(int num : nums) {

            // Handle the situation that at the beginning or the former majority was caught up
            if (majorityCount == 0) comparedCandidate = num ;  // Change candidate

            // Meet the same one of majority
            if(comparedCandidate == num) {
                majorityCount ++ ;
            } else {
                majorityCount -- ;
            }
        }

        return comparedCandidate ;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 2, 3} ;
        System.out.println(majorityElementUseHashMap(nums1));
        System.out.println(majorityElementUseSorting(nums1));
        System.out.println(majorityElementUseMooreVotingAlgorithm(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2} ;
        System.out.println(majorityElementUseHashMap(nums2));
        System.out.println(majorityElementUseSorting(nums2));
        System.out.println(majorityElementUseMooreVotingAlgorithm(nums2));

    }
}
