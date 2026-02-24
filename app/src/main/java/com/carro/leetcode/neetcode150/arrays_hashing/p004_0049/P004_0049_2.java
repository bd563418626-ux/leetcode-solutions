package com.carro.leetcode.neetcode150.arrays_hashing.p004_0049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P004_0049_2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
