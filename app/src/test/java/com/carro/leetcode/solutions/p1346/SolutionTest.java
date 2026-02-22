package com.carro.leetcode.solutions.p1346;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsTrueForFirstSample() {
        assertTrue(solution.checkIfExist(new int[] {10, 2, 5, 3}));
    }

    @Test
    void returnsFalseForSecondSample() {
        assertFalse(solution.checkIfExist(new int[] {3, 1, 7, 11}));
    }

    @Test
    void returnsTrueWhenArrayHasTwoZeros() {
        assertTrue(solution.checkIfExist(new int[] {0, 0}));
    }

    @Test
    void returnsFalseWhenArrayHasSingleZero() {
        assertFalse(solution.checkIfExist(new int[] {0}));
    }

    @Test
    void returnsTrueForNegativeNumbers() {
        assertTrue(solution.checkIfExist(new int[] {-2, 0, -4}));
    }

    @Test
    void returnsFalseWhenNoPairExists() {
        assertFalse(solution.checkIfExist(new int[] {1, 3, 9, 27}));
    }
}
