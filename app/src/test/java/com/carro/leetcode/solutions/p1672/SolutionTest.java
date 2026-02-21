package com.carro.leetcode.solutions.p1672;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsSixForFirstSample() {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        assertEquals(6, solution.maximumWealth(accounts));
    }

    @Test
    void returnsTenForSecondSample() {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        assertEquals(10, solution.maximumWealth(accounts));
    }

    @Test
    void returnsSeventeenForThirdSample() {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        assertEquals(17, solution.maximumWealth(accounts));
    }
}
