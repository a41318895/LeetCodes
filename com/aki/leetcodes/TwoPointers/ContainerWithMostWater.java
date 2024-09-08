package com.aki.leetcodes.TwoPointers;

// LeetCode : 11
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int maxArea = 0 ;
        int left = 0, right = height.length - 1 ;

        while (left < right) {

            int currentArea = Math.min(height[left], height[right]) * (right - left) ;

            if(currentArea > maxArea) maxArea = currentArea ;

            if(height[left] < height[right]) {
                left ++ ;
            } else {
                right -- ;
            }
        }

        return maxArea ;
    }

    public static void main(String[] args) {

        int[] heightArray1 = {1, 8, 6, 2, 5, 4, 8, 3, 7} ;
        System.out.println(maxArea(heightArray1));

        int[] heightArray2 = {1, 1} ;
        System.out.println(maxArea(heightArray2));
    }
}
