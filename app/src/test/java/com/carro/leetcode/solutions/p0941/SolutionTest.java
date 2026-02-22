package com.carro.leetcode.solutions.p0941;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsTrueForValidMountainArray() {
        assertTrue(solution.validMountainArray(new int[] {0, 3, 2, 1}));
    }

    @Test
    void returnsFalseWhenLengthIsLessThanThree() {
        assertFalse(solution.validMountainArray(new int[] {2, 1}));
    }

    @Test
    void returnsFalseWhenOnlyIncreasing() {
        assertFalse(solution.validMountainArray(new int[] {0, 1, 2, 3, 4}));
    }

    @Test
    void returnsFalseWhenOnlyDecreasing() {
        assertFalse(solution.validMountainArray(new int[] {5, 4, 3, 2, 1}));
    }

    @Test
    void returnsFalseWhenPeakIsAtStart() {
        assertFalse(solution.validMountainArray(new int[] {3, 2, 1}));
    }

    @Test
    void returnsFalseWhenPeakIsAtEnd() {
        assertFalse(solution.validMountainArray(new int[] {1, 2, 3}));
    }

    @Test
    void returnsFalseWhenAdjacentValuesAreEqual() {
        assertFalse(solution.validMountainArray(new int[] {0, 2, 2, 1}));
    }
}
