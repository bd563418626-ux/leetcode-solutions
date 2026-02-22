package com.carro.leetcode.solutions.p1089;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void duplicatesZerosForSampleCase() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        solution.duplicateZeros(arr);

        assertArrayEquals(new int[] {1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

    @Test
    void handlesZeroAtBoundaryWithoutOverflow() {
        int[] arr = {1, 2, 3, 0};

        solution.duplicateZeros(arr);

        assertArrayEquals(new int[] {1, 2, 3, 0}, arr);
    }

    @Test
    void keepsArraySameWhenNoZeros() {
        int[] arr = {1, 2, 3};

        solution.duplicateZeros(arr);

        assertArrayEquals(new int[] {1, 2, 3}, arr);
    }

    @Test
    void handlesConsecutiveZerosWithinFixedLength() {
        int[] arr = {0, 0, 1, 2};

        solution.duplicateZeros(arr);

        assertArrayEquals(new int[] {0, 0, 0, 0}, arr);
    }
}
