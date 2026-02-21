package com.carro.leetcode.solutions.p0485;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
	private final Solution solution = new Solution();

	@Test
	void returnsThreeForSampleCase() {
		int actual = solution.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1});
		assertEquals(3, actual);
	}

	@Test
	void returnsTwoForSeparatedOnes() {
		int actual = solution.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1});
		assertEquals(2, actual);
	}

	@Test
	void returnsZeroWhenAllZeros() {
		int actual = solution.findMaxConsecutiveOnes(new int[] {0, 0, 0, 0});
		assertEquals(0, actual);
	}

	@Test
	void returnsLengthWhenAllOnes() {
		int actual = solution.findMaxConsecutiveOnes(new int[] {1, 1, 1, 1});
		assertEquals(4, actual);
	}

	@Test
	void handlesSingleElementArrays() {
		assertEquals(1, solution.findMaxConsecutiveOnes(new int[] {1}));
		assertEquals(0, solution.findMaxConsecutiveOnes(new int[] {0}));
	}
}
