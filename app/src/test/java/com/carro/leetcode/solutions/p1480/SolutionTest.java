package com.carro.leetcode.solutions.p1480;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsExpectedRunningSumForSampleOne() {
        int[] actual = solution.runningSum(new int[] {1, 2, 3, 4});

        assertArrayEquals(new int[] {1, 3, 6, 10}, actual);
    }

    @Test
    void returnsExpectedRunningSumForSampleTwo() {
        int[] actual = solution.runningSum(new int[] {1, 1, 1, 1, 1});

        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, actual);
    }

    @Test
    void returnsExpectedRunningSumForSampleThree() {
        int[] actual = solution.runningSum(new int[] {3, 1, 2, 10, 1});

        assertArrayEquals(new int[] {3, 4, 6, 16, 17}, actual);
    }

    @Test
    void handlesSingleElementArray() {
        int[] actual = solution.runningSum(new int[] {5});

        assertArrayEquals(new int[] {5}, actual);
    }
}
