package com.carro.leetcode.solutions.p1312;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsSixForFourteen() {
        assertEquals(6, solution.numberOfSteps(14));
    }

    @Test
    void returnsFourForEight() {
        assertEquals(4, solution.numberOfSteps(8));
    }

    @Test
    void returnsTwelveForOneHundredTwentyThree() {
        assertEquals(12, solution.numberOfSteps(123));
    }

    @Test
    void returnsZeroForZero() {
        assertEquals(0, solution.numberOfSteps(0));
    }

    @Test
    void returnsOneForOne() {
        assertEquals(1, solution.numberOfSteps(1));
    }
}
