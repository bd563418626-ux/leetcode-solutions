package com.carro.leetcode.neetcode150.arrays_hashing.p003_0001;

import java.util.HashMap;
import java.util.Map;

public class P003_0001_M {
    public int[] twoSum(int[] nums, int target) {
        // 📚 歴史書： <数値(Value), そのインデックス(Index)>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current; // 🧩 運命の相手（補数）

            // もし歴史書に「相手」がいれば、即マッチング成立
            if (map.containsKey(complement)) {
                // {相手のインデックス, 現在のインデックス} を返す
                return new int[] { map.get(complement), i };
            }

            // まだ相手がいないなら、自分を歴史書に登録して待つ
            map.put(current, i);
        }

        // 解が必ずある前提なので、ここには到達しない
        return new int[]{}; 
    }
}