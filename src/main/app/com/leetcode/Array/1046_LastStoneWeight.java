package com.leetcode.Array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxPq = new PriorityQueue<>(stones.length, Comparator.reverseOrder());
        for (int stone : stones) {
            maxPq.add(stone);
        }
        while (maxPq.size() >= 2) {
            int y = maxPq.poll();
            int x = maxPq.poll();
            if (y > x) {
                maxPq.add(y - x);
            }
        }
        return maxPq.isEmpty() ? 0 : maxPq.peek();
    }
}