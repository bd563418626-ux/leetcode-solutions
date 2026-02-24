package com.carro.leetcode.neetcode150.arrays_hashing.p002_0242;

public class P002_0242_3_Array {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;

            if (charCount[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}
