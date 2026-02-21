package com.carro.leetcode.solutions.p0412;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsCorrectSequenceForN15() {
        List<String> actual = solution.fizzBuzz(15);

        List<String> expected = List.of(
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");

        assertEquals(expected, actual);
    }

    @Test
    void returnsSingleValueForN1() {
        List<String> actual = solution.fizzBuzz(1);

        assertEquals(List.of("1"), actual);
    }

    @Test
    void returnsFizzBuzzAtMultiplesOfFifteen() {
        List<String> actual = solution.fizzBuzz(30);

        assertEquals("FizzBuzz", actual.get(14));
        assertEquals("FizzBuzz", actual.get(29));
    }
}
