package com.leetcode.BinarySearch;

class Solution51 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int index = bSearch(nums, 0, nums.length-1, target);
        if (index == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int i = index;
        res[0] = index;
        res[1] = index;
        while (i >= 0 && nums[i] == target) {
            res[0] = i;
            i--;
        }
        i = index;
        while (i < nums.length && nums[i] == target) {
            res[1] = i;
            i++;
        }
        return res;
    }


    public int bSearch(int[] nums, int start, int end, int target) {
        if (start < 0 || end >= nums.length || start > end) return -1;
        int mid = (start + end) / 2;
        if (target == nums[mid]) return mid;
        else if (target < nums[mid]) {
            return bSearch(nums, start, mid - 1, target);
        } else {
            return bSearch(nums, mid + 1, end, target);
        }
    }
}