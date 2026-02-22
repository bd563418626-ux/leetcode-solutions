package com.carro.leetcode.solutions.p0977;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsSortedSquaresForFirstSample() {
        int[] actual = solution.sortedSquares(new int[] {-4, -1, 0, 3, 10});

        assertArrayEquals(new int[] {0, 1, 9, 16, 100}, actual);
    }

    @Test
    void returnsSortedSquaresForSecondSample() {
        int[] actual = solution.sortedSquares(new int[] {-7, -3, 2, 3, 11});

        assertArrayEquals(new int[] {4, 9, 9, 49, 121}, actual);
    }

    @Test
    void handlesAllNegativeNumbers() {
        int[] actual = solution.sortedSquares(new int[] {-5, -4, -1});

        assertArrayEquals(new int[] {1, 16, 25}, actual);
    }

    @Test
    void handlesSingleZero() {
        int[] actual = solution.sortedSquares(new int[] {0});

        assertArrayEquals(new int[] {0}, actual);
    }
}
