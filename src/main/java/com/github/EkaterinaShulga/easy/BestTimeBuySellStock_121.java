package com.github.EkaterinaShulga.easy;

public class BestTimeBuySellStock_121 {
    public int maxProfit(int[] prices) {
        int cost = prices[0];
        int income = 0;
        for (int i = 1; i < prices.length; i++) {
            if (cost > prices[i]) {
                cost = prices[i];
            }
            if (income < prices[i] - cost) {
                income = prices[i] - cost;

            }

        }

        return income;
    }

    public static void main(String[] args) {
        BestTimeBuySellStock_121 best = new BestTimeBuySellStock_121();
        int[] prices = {7, 1, 5, 3, 6, 4};//5
        // int[] prices = {2, 1, 2, 1, 0, 1, 2};//2

        System.out.println(best.maxProfit(prices));
    }
}
