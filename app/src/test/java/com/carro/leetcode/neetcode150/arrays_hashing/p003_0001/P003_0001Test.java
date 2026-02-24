package com.carro.leetcode.neetcode150.arrays_hashing.p003_0001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class P003_0001Test {

    private final P003_0001_1 solution1 = new P003_0001_1();
    private final P003_0001_M solutionM = new P003_0001_M();

    @Test
    void returnIndicesWhenTwoNumbersSumToTarget() {
        assertAllEqual(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1});
    }

    @Test
    void returnIndicesWithDifferentTarget() {
        assertAllEqual(new int[]{3, 2, 4}, 6, new int[]{1, 2});
    }

    @Test
    void returnIndicesWithRepeatedNumbers() {
        assertAllEqual(new int[]{3, 3}, 6, new int[]{0, 1});
    }

    @Test
    void returnIndicesWithLargeArray() {
        assertAllEqual(new int[]{1, 2, 3, 4, 5, 10}, 15, new int[]{4, 5});
    }

    @Test
    void returnIndicesWithTwoOccurrences() {
        assertAllEqual(new int[]{2, 5, 5, 11}, 10, new int[]{1, 2});
    }

    private void assertAllEqual(int[] nums, int target, int[] expected) {
        int[] result1 = solution1.twoSum(nums, target);
        int[] resultM = solutionM.twoSum(nums, target);

        assertArrayEquals(expected, result1, "P003_0001_1 failed");
        assertArrayEquals(expected, resultM, "P003_0001_M failed");

        // Verify correctness: indices should sum to target
        assertEquals(target, nums[result1[0]] + nums[result1[1]], "P003_0001_1 sum check failed");
        assertEquals(target, nums[resultM[0]] + nums[resultM[1]], "P003_0001_M sum check failed");
    }
}
