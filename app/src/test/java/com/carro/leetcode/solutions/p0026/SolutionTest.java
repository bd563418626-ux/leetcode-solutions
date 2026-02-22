package com.carro.leetcode.solutions.p0026;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void removesDuplicatesForFirstSample() {
        int[] nums = {1, 1, 2};

        int k = solution.removeDuplicates(nums);

        assertEquals(2, k);
        assertArrayEquals(new int[] {1, 2}, Arrays.copyOf(nums, k));
    }

    @Test
    void removesDuplicatesForSecondSample() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = solution.removeDuplicates(nums);

        assertEquals(5, k);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, Arrays.copyOf(nums, k));
    }

    @Test
    void returnsOneForSingleElementArray() {
        int[] nums = {7};

        int k = solution.removeDuplicates(nums);

        assertEquals(1, k);
        assertArrayEquals(new int[] {7}, Arrays.copyOf(nums, k));
    }

    @Test
    void returnsZeroForEmptyArray() {
        int[] nums = {};

        int k = solution.removeDuplicates(nums);

        assertEquals(0, k);
        assertArrayEquals(new int[] {}, Arrays.copyOf(nums, k));
    }
}
