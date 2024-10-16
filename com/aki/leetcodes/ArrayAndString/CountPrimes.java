package com.aki.leetcodes.ArrayAndString;

import java.util.Arrays;

// LeetCode : 204
public class CountPrimes {

    // Time Complexity : O(n log log n)
    public static int countPrimeNumber(int targetN) {

        if(targetN < 2) return 0 ;
        if(targetN == 2) return 1 ;

        int count = 1 ;  // 2 added

        boolean[] isPrimeArray = new boolean[targetN] ;
        Arrays.fill(isPrimeArray, true) ;
        isPrimeArray[0] = isPrimeArray[1] = false ;     // Handle not prime numbers

        // Iterate from the smallest prime : 3
        for(int i = 3 ; i < targetN ; i += 2) {     // Only handle odd numbers

            if(isPrimeArray[i]) {

                count ++ ;

                // Perfect square number of "i" is definitely not a prime,
                // and also its "value + i" repeat X times.
                for(int j = i * i ; j < targetN ; j += i) {
                    isPrimeArray[j] = false ;
                }
            }
        }

        return count ;
    }

    // Time Complexity : O(n log log n)
    // It should be faster because this method reduce the times of iterating.
    public static int countPrimeNumberOptimized(int targetN) {

        if(targetN < 2) return 0 ;
        if(targetN == 2) return 1 ;

        // Reduce the process to initialize
        boolean[] isCompositeArray = new boolean[targetN] ;

        // Suppose all odds are prime :
        int primeCount = targetN / 2 ;

        // "i * i" is the smallest unsigned composite of i's multiples
        for(int i = 3 ; i * i < targetN ; i += 2) {

            if(!isCompositeArray[i]) {

                // "prime * prime" must become a composite
                // "j += 2 * i" means :
                // j is a composite, so j (i * i) + i must be composite.
                // But, we don't need to handle the evens,
                // so make it times i -> "2 * i".
                // Result : j (odd) += 2 * i (even) -> still (odd)
                for(int j = i * i ; j < targetN ; j += 2 * i) {

                    if(!isCompositeArray[j]) {
                        isCompositeArray[j] = true ;
                        primeCount -- ;
                    }
                }
            }
        }

        // No need to remove number 1 because number 2 is the only even prime. They can offset each other.
        return primeCount ;
    }

    public static void main(String[] args) {

        int targetN1 = 1 ;
        System.out.println(countPrimeNumber(targetN1) + " prime number(s) in " + targetN1) ;
        System.out.println(countPrimeNumberOptimized(targetN1) + " prime number(s) in " + targetN1) ;

        int targetN2 = 2 ;
        System.out.println(countPrimeNumber(targetN2) + " prime number(s) in " + targetN2) ;
        System.out.println(countPrimeNumberOptimized(targetN2) + " prime number(s) in " + targetN2) ;

        int targetN3 = 10 ;
        System.out.println(countPrimeNumber(targetN3) + " prime number(s) in " + targetN3) ;
        System.out.println(countPrimeNumberOptimized(targetN3) + " prime number(s) in " + targetN3) ;
    }
}
