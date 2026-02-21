package com.carro.leetcode.solutions.p0485;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsec = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxConsec = Math.max(maxConsec, count);
                count = 0;
            }
        }
        maxConsec = Math.max(maxConsec, count);
        return maxConsec;
    }
}