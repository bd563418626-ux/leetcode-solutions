package com.carro.leetcode.neetcode150.arrays_hashing.p003_0001;

import java.util.HashMap;
import java.util.Map;

public class P003_0001_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}