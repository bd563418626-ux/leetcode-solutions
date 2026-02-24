package com.carro.leetcode.neetcode150.arrays_hashing.p002_0242;

import java.util.HashMap;
import java.util.Map;

public class P002_0242_3_HashMap {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            charCount.put(t.charAt(i), charCount.getOrDefault(t.charAt(i), 0) - 1);

            if (charCount.getOrDefault(t.charAt(i), 0) < 0) {
                return false;
            }
        }
        
        return true;
    }
}
