package com.aki.leetcodes.StackAndQueue;

import java.util.Stack;

// LeetCode : 682
public class BaseballGame {

    public static int calPoints(String[] operations) {

        Stack<Integer> scoreStack = new Stack<>() ;

        for (String operation : operations) {

            switch (operation) {
                case "+":
                    Integer intPushed = scoreStack.get(scoreStack.size() - 1) + scoreStack.get(scoreStack.size() - 2);
                    scoreStack.push(intPushed) ;
                    break ;
                case "C":
                    scoreStack.pop() ;
                    break ;
                case "D":
                    scoreStack.push(scoreStack.peek() * 2) ;
                    break ;
                default:
                    scoreStack.push(Integer.parseInt(operation)) ;   // String to Integer
                    break ;
            }
        }

        int sum = 0 ;
        for(int score : scoreStack) {
            sum += score ;
        }

        return sum ;
    }

    // Modified the place which case equals "+" in order to avoid "ArrayIndexOutOfBoundsException" occurring.
    public static int calPointsOptimized(String[] operations) {

        Stack<Integer> scoreStack2 = new Stack<>() ;

        for (String operation : operations) {

            switch (operation) {
                case "+":
                    int top = scoreStack2.pop() ;
                    int adds = scoreStack2.peek() + top ;
                    scoreStack2.push(top) ;
                    scoreStack2.push(adds) ;
                    break ;
                case "C":
                    scoreStack2.pop() ;
                    break ;
                case "D":
                    scoreStack2.push(scoreStack2.peek() * 2) ;
                    break ;
                default:
                    scoreStack2.push(Integer.parseInt(operation)) ;
                    break ;
            }
        }

        int sum = 0 ;
        for(int score : scoreStack2) {
            sum += score ;
        }

        return sum ;
    }

    public static void main(String[] args) {

        String[] ops1 = {"5", "2", "C", "D", "+"} ;
        System.out.println(calPoints(ops1));
        System.out.println(calPointsOptimized(ops1));

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"} ;
        System.out.println(calPoints(ops2));
        System.out.println(calPointsOptimized(ops2));

        String[] ops3 = {"1", "C"} ;
        System.out.println(calPoints(ops3));
        System.out.println(calPointsOptimized(ops3));
    }
}
