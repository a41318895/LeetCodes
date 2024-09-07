package com.aki.leetcodes.ArrayAndString;

import java.util.Arrays;

// LeetCode : 121
public class BestTimeToBuyAndSellStock {

    public static int getMaxProfit(int[] prices) {

        int buy = Integer.MAX_VALUE ;
        int sell = 0 ;

        for (int price : prices) {

            buy = Math.min(buy, price);     // Ensure the buying price the lowest
            sell = Math.max(sell, price - buy);       // Ensure the selling profit the highest
        }

        return sell ;
    }

    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4} ;
        int[] prices2 = {7, 6, 4, 3, 1} ;
        System.out.println("Prices Everyday: " + Arrays.toString(prices1) + ", Max Profit: " + getMaxProfit(prices1));
        System.out.println("Prices Everyday: " + Arrays.toString(prices2) + ", Max Profit: " + getMaxProfit(prices2));
    }
}
