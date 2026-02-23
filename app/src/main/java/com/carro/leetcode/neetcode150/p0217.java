package com.carro.leetcode.neetcode150;

import java.util.HashSet;
import java.util.Set;

public class p0217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
