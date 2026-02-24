package com.carro.leetcode.neetcode150.arrays_hashing.p001_0217;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class P001_0217Test {

    private final P001_0217 solution = new P001_0217();

    @Test
    void returnsTrueWhenDuplicateExists() {
        assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void returnsFalseWhenAllValuesUnique() {
        assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void returnsFalseForSingleElement() {
        assertFalse(solution.containsDuplicate(new int[]{42}));
    }

    @Test
    void returnsFalseForEmptyArray() {
        assertFalse(solution.containsDuplicate(new int[]{}));
    }
}
