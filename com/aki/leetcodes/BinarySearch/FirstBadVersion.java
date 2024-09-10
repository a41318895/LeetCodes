package com.aki.leetcodes.BinarySearch;

// LeetCode : 278
public class FirstBadVersion extends VersionControl {

    public static int firstBadVersion(int n) {

        int start = 1, end = n ;

        // If start == end, the first bad version is found.
        while (start < end) {

            int mid = start + ( end - start ) / 2 ;

            if(isBadVersionForExample1(mid)) {
                end = mid ;     // Because the condition is >= firstBadVersion, mid - 1 may miss the first bad version
            } else {
                start = mid + 1 ;
            }

//            if(isBadVersionForExample2(mid)) {
//                end = mid ;
//            } else {
//                start = mid + 1 ;
//            }
        }

        return end ;
    }

    public static void main(String[] args) {

        int versionNum = 5 ;
        //int versionNum2 = 1 ;

        System.out.println(firstBadVersion(versionNum));
        //System.out.println(firstBadVersion(versionNum2));

    }
}

class VersionControl {

    static int calledCount = 0 ;

    static boolean isBadVersionForExample1(int version) {

        ++ calledCount ;
        System.out.println("The 'isBadVersionForExample1' method was called " + calledCount + " times.");

        return version >= 4 ;
    }

    static boolean isBadVersionForExample2(int version) {

        ++ calledCount ;
        System.out.println("The 'isBadVersionForExample2' method was called " + calledCount + " times.");

        return version >= 1 ;
    }
}
