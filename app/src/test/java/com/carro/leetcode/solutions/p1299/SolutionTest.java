package com.carro.leetcode.solutions.p1299;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void replacesElementsForFirstSample() {
        int[] result = solution.replaceElements(new int[] {17, 18, 5, 4, 6, 1});

        assertArrayEquals(new int[] {18, 6, 6, 6, 1, -1}, result);
    }

    @Test
    void replacesElementsForSecondSample() {
        int[] result = solution.replaceElements(new int[] {400});

        assertArrayEquals(new int[] {-1}, result);
    }

    @Test
    void replacesElementsForStrictlyIncreasingArray() {
        int[] result = solution.replaceElements(new int[] {1, 2, 3, 4});

        assertArrayEquals(new int[] {4, 4, 4, -1}, result);
    }

    @Test
    void replacesElementsForStrictlyDecreasingArray() {
        int[] result = solution.replaceElements(new int[] {5, 4, 3, 2, 1});

        assertArrayEquals(new int[] {4, 3, 2, 1, -1}, result);
    }
}
