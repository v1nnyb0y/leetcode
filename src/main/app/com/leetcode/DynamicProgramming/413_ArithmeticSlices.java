package com.leetcode.DynamicProgramming;

class Solution178 {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
            return 0    ;
        int [] dp=new int[nums.length];
        int ans=0;

        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                dp[i]=dp[i-1]+1;
                ans =ans+dp[i];
            }
        }
        return ans;
    }
}