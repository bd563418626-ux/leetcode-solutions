package com.carro.leetcode.solutions.p1295;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsTwoForFirstSample() {
        int actual = solution.findNumbers(new int[] {12, 345, 2, 6, 7896});

        assertEquals(2, actual);
    }

    @Test
    void returnsOneForSecondSample() {
        int actual = solution.findNumbers(new int[] {555, 901, 482, 1771});

        assertEquals(1, actual);
    }

    @Test
    void countsOnlyEvenDigitNumbers() {
        int actual = solution.findNumbers(new int[] {10, 100, 1000, 10000});

        assertEquals(2, actual);
    }

    @Test
    void returnsZeroWhenNoEvenDigitNumbers() {
        int actual = solution.findNumbers(new int[] {1, 333, 77777});

        assertEquals(0, actual);
    }
}
