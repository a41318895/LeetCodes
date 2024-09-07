package com.aki.leetcodes.ArrayAndString;

import java.util.ArrayList;
import java.util.List;

// LeetCode : 228
public class SummaryRanges {

    public static List<String> getSummaryRanges(int[] nums) {

        if(nums == null || nums.length == 0) {
            return new ArrayList<>() ;
        }

        List<String> ranges = new ArrayList<>() ;
        int startPoint = nums[0] ;

        for(int i = 1 ; i < nums.length ; i ++) {

            // Not Continuous
            if(nums[i] != nums[i - 1] + 1) {

                if(startPoint == nums[i - 1]) {
                    ranges.add("\"" + startPoint + "\"") ;
                } else {
                    ranges.add("\"" + startPoint + " -> " + nums[i - 1] + "\"") ;
                }
                startPoint = nums[i] ;
            }
        }

        // Handle the last element
        if (startPoint == nums[nums.length - 1]) {
            ranges.add("\"" + startPoint + "\"") ;
        } else {
            ranges.add("\"" + startPoint + " -> " + nums[nums.length - 1] + "\"") ;
        }

        return ranges ;
    }

    public static void main(String[] args) {

        int[] numbers1 = {0, 1, 2, 4, 5, 7} ;
        int[] numbers2 = {0, 2, 3, 4, 6, 8, 9} ;
        System.out.println(getSummaryRanges(numbers1));
        System.out.println(getSummaryRanges(numbers2));
    }
}
