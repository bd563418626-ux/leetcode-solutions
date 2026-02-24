package com.carro.leetcode.neetcode150.arrays_hashing.p002_0242;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class P002_0242Test {

    private final P002_0242_1_Array solution1Array = new P002_0242_1_Array();
    private final P002_0242_1_HashMap solution1HashMap = new P002_0242_1_HashMap();
    private final P002_0242_2_Array solution2Array = new P002_0242_2_Array();
    private final P002_0242_2_HashMap solution2HashMap = new P002_0242_2_HashMap();
    private final P002_0242_3_Array solution3Array = new P002_0242_3_Array();
    private final P002_0242_3_HashMap solution3HashMap = new P002_0242_3_HashMap();

    @Test
    void returnsTrueForValidAnagram() {
        assertAllTrue("anagram", "nagaram");
    }

    @Test
    void returnsFalseForDifferentLength() {
        assertAllFalse("rat", "carb");
    }

    @Test
    void returnsFalseForSameLengthNonAnagram() {
        assertAllFalse("rat", "car");
    }

    @Test
    void returnsTrueForRepeatedCharacters() {
        assertAllTrue("aacc", "ccaa");
    }

    @Test
    void returnsTrueForEmptyStrings() {
        assertAllTrue("", "");
    }

    @Test
    void returnsFalseWhenCountsDoNotMatch() {
        assertAllFalse("aabbcc", "aabbcd");
    }

    private void assertAllTrue(String s, String t) {
        assertTrue(solution1Array.isAnagram(s, t));
        assertTrue(solution1HashMap.isAnagram(s, t));
        assertTrue(solution2Array.isAnagram(s, t));
        assertTrue(solution2HashMap.isAnagram(s, t));
        assertTrue(solution3Array.isAnagram(s, t));
        assertTrue(solution3HashMap.isAnagram(s, t));
    }

    private void assertAllFalse(String s, String t) {
        assertFalse(solution1Array.isAnagram(s, t));
        assertFalse(solution1HashMap.isAnagram(s, t));
        assertFalse(solution2Array.isAnagram(s, t));
        assertFalse(solution2HashMap.isAnagram(s, t));
        assertFalse(solution3Array.isAnagram(s, t));
        assertFalse(solution3HashMap.isAnagram(s, t));
    }
}
