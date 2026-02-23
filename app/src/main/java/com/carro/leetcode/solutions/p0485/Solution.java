package com.carro.leetcode.solutions.p0485;

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;     // これまでの最大コンボ（ハイスコア）
        int currentCount = 0; // 現在進行中のコンボ

        for (int num : nums) {
            if (num == 1) {
                currentCount++; // 1ならコンボ継続
                // 常にハイスコアを更新するかチェックする
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0; // 0ならコンボリセット
            }
        }
        return maxCount;
    }
}
