package com.carro.leetcode.neetcode150.arrays_hashing.p001_0217;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class P001_0217Test {

    private final P001_0217_1 solution1 = new P001_0217_1();
    private final P001_0217_M solutionM = new P001_0217_M();

    @Test
    void returnsTrueWhenDuplicateExists() {
        assertAllTrue(new int[]{1, 2, 3, 1});
    }

    @Test
    void returnsFalseWhenAllValuesUnique() {
        assertAllFalse(new int[]{1, 2, 3, 4});
    }

    @Test
    void returnsFalseForSingleElement() {
        assertAllFalse(new int[]{42});
    }

    @Test
    void returnsFalseForEmptyArray() {
        assertAllFalse(new int[]{});
    }

    @Test
    void returnsTrueForDuplicateAtEnd() {
        assertAllTrue(new int[]{1, 2, 3, 4, 5, 3});
    }

    @Test
    void returnsTrueForConsecutiveDuplicates() {
        assertAllTrue(new int[]{5, 5});
    }

    private void assertAllTrue(int[] nums) {
        assertTrue(solution1.containsDuplicate(nums), "P001_0217_1 failed");
        assertTrue(solutionM.containsDuplicate(nums), "P001_0217_M failed");
    }

    private void assertAllFalse(int[] nums) {
        assertFalse(solution1.containsDuplicate(nums), "P001_0217_1 failed");
        assertFalse(solutionM.containsDuplicate(nums), "P001_0217_M failed");
    }
}
