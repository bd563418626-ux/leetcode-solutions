package com.carro.leetcode.solutions.p0027;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void removesTargetValuesForFirstSample() {
        int[] nums = {3, 2, 2, 3};

        int k = solution.removeElement(nums, 3);

        assertEquals(2, k);
        assertArrayEquals(new int[] {2, 2}, Arrays.copyOf(nums, k));
    }

    @Test
    void removesTargetValuesForSecondSample() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int k = solution.removeElement(nums, 2);

        assertEquals(5, k);
        assertArrayEquals(new int[] {0, 1, 3, 0, 4}, Arrays.copyOf(nums, k));
    }

    @Test
    void returnsOriginalLengthWhenTargetNotFound() {
        int[] nums = {1, 2, 3};

        int k = solution.removeElement(nums, 4);

        assertEquals(3, k);
        assertArrayEquals(new int[] {1, 2, 3}, Arrays.copyOf(nums, k));
    }

    @Test
    void returnsZeroWhenAllElementsAreTarget() {
        int[] nums = {7, 7, 7};

        int k = solution.removeElement(nums, 7);

        assertEquals(0, k);
        assertArrayEquals(new int[] {}, Arrays.copyOf(nums, k));
    }
}
