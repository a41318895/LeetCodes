package com.aki.leetcodes.BinarySearch;

// LeetCode : 367
public class ValidPerfectSquare {

    // Can't use any built-in method such as sqrt()
    public static boolean isPerfectSquare(int num) {

        int start = 1, end = num ;

        while(start <= end) {

            // If we use (start + end) / 2 here, 'start + end' may have caused overflow (Integer.MAX_VALUE).
            int mid = start + ( end - start ) / 2 ;
            long square = (long) mid * mid ;            // Avoid overflow

            if(square == num) return true ;
            else if(square > num) end = mid - 1 ;
            else start = mid + 1 ;
        }

        return false ;
    }

    public static void main(String[] args) {

        int num1 = 16 ;
        System.out.println(isPerfectSquare(num1));

        int num2 = 14 ;
        System.out.println(isPerfectSquare(num2));
    }
}
