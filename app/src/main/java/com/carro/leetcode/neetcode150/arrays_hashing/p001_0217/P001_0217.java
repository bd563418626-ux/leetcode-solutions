package com.carro.leetcode.neetcode150.arrays_hashing.p001_0217;

import java.util.HashSet;
import java.util.Set;

public class P001_0217 {
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
