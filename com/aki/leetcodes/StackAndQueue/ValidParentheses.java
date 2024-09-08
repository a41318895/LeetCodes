package com.aki.leetcodes.StackAndQueue;

import java.util.Stack;

// LeetCode : 20
public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> bracketsStack = new Stack<>() ;

        for(char c : s.toCharArray()) {

            if(c == '(' || c == '{' || c == '[') {
                bracketsStack.push(c);
            } else {

                if(bracketsStack.isEmpty()) return false ;  // Avoid EmptyStackException occurring

                Character topElement = bracketsStack.pop();
                if((topElement != '(' && c == ')') ||
                   (topElement != '[' && c == ']') ||
                   (topElement != '{' && c == '}')) return false ;
            }
        }

        return bracketsStack.isEmpty() ;
    }

    public static void main(String[] args) {

        String str1 = "()" ;
        System.out.println(isValid(str1));

        String str2 = "()[]{}";
        System.out.println(isValid(str2));

        String str3 = "(]";
        System.out.println(isValid(str3));

        String str4 = "([])";
        System.out.println(isValid(str4));
    }
}
