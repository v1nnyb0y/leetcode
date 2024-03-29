package com.leetcode.DynamicProgramming;

class Solution193 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int ans = 0;

        for (int i = 1; i < len; i++){
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}