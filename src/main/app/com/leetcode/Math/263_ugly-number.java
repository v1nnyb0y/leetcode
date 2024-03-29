package com.leetcode.Math;

class Solution96 {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        for (int factor : new int[] { 2, 3, 5 }) {
            n = keepDividingWhenDivisible(n, factor);
        }

        return n == 1;
    }

    private int keepDividingWhenDivisible(int dividend, int divisor) {
        while (dividend % divisor == 0) {
            dividend /= divisor;
        }
        return dividend;
    }
}