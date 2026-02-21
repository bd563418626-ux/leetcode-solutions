package com.carro.leetcode.solutions.p0383;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
	private final Solution solution = new Solution();

	@Test
	void returnsFalseWhenMagazineLacksCharacters() {
		assertFalse(solution.canConstruct("a", "b"));
	}

	@Test
	void returnsFalseWhenCharacterCountIsInsufficient() {
		assertFalse(solution.canConstruct("aa", "ab"));
	}

	@Test
	void returnsTrueWhenMagazineHasEnoughCharacters() {
		assertTrue(solution.canConstruct("aa", "aab"));
	}

	@Test
	void returnsTrueWhenRansomNoteIsEmpty() {
		assertTrue(solution.canConstruct("", "anything"));
	}

	@Test
	void returnsTrueForExactCharacterUsage() {
		assertTrue(solution.canConstruct("abc", "cba"));
	}
}
