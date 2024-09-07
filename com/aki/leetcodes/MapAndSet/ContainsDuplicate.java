package com.aki.leetcodes.MapAndSet;

import java.util.HashSet;
import java.util.Set;

// LeetCode : 217
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> uniqueNumSet = new HashSet<>();

        for(int num : nums) {
            if(uniqueNumSet.contains(num)) {
                return true ;
            }
            uniqueNumSet.add(num) ;
        }

        return false ;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1} ;
        int[] nums2 = {1, 2, 3, 4} ;
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2} ;

        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}
