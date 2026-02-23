package com.carro.leetcode.neetcode150;

import java.util.HashSet;
import java.util.Set;

public class p0217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> existed = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (existed.contains(nums[i])) {
                return true;
            }
            existed.add(nums[i]);
        }
        return false;
    }
}
