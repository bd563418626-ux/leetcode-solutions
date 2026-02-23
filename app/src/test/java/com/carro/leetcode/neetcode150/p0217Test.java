package com.carro.leetcode.neetcode150;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class p0217Test {
    private final p0217 solution = new p0217();

    @Test
    void returnsTrueWhenArrayContainsDuplicate() {
        boolean result = solution.containsDuplicate(new int[] {1, 2, 3, 1});

        assertTrue(result);
    }

    @Test
    void returnsFalseWhenArrayHasAllUniqueValues() {
        boolean result = solution.containsDuplicate(new int[] {1, 2, 3, 4});

        assertFalse(result);
    }

    @Test
    void returnsTrueWhenArrayContainsNegativeDuplicate() {
        boolean result = solution.containsDuplicate(new int[] {-1, -2, -3, -1});

        assertTrue(result);
    }

    @Test
    void returnsFalseForSingleElementArray() {
        boolean result = solution.containsDuplicate(new int[] {42});

        assertFalse(result);
    }

    @Test
    void returnsFalseForEmptyArray() {
        boolean result = solution.containsDuplicate(new int[] {});

        assertFalse(result);
    }
}
