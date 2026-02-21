package com.carro.leetcode.solutions.p0383;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] invetory = new int[26];
        for(char c : magazine.toCharArray()) {
            invetory[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
            invetory[c - 'a']--;
            if(invetory[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

/*
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> magazineInventory = registerInventory(magazine);
        for (char c : ransomNote.toCharArray()) {
            int curInventory = magazineInventory.getOrDefault(c, 0);
            if (curInventory == 0) {
                return false;
            }
            magazineInventory.put(c, curInventory - 1);
        }
        return true;
    }

    private Map<Character, Integer> registerInventory(String s) {
        Map<Character, Integer> invetory = new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = invetory.getOrDefault(c, 0);
            invetory.put(c, count + 1);
        }
        return invetory;
    }
}
*/

/*
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c);
            if(index == -1) {
                return false;
            }
            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }
        return true;
    }
}
*/