package com.carro.leetcode.neetcode150.arrays_hashing.p004_0049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class P004_0049Test {

    private final P004_0049_1 solution1 = new P004_0049_1();
    private final P004_0049_2 solution2 = new P004_0049_2();

    @Test
    void groupsAnagramsForBasicInput() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = Arrays.asList(
            Arrays.asList("eat", "tea", "ate"),
            Arrays.asList("tan", "nat"),
            Arrays.asList("bat")
        );

        assertAllEqual(expected, input);
    }

    @Test
    void handlesSingleElement() {
        String[] input = {"abc"};
        List<List<String>> expected = Arrays.asList(
            Arrays.asList("abc")
        );

        assertAllEqual(expected, input);
    }

    @Test
    void handlesEmptyInput() {
        String[] input = {};
        List<List<String>> expected = Arrays.asList();

        assertAllEqual(expected, input);
    }

    @Test
    void keepsDuplicateStrings() {
        String[] input = {"aa", "aa", "bb"};
        List<List<String>> expected = Arrays.asList(
            Arrays.asList("aa", "aa"),
            Arrays.asList("bb")
        );

        assertAllEqual(expected, input);
    }

    @Test
    void handlesMultipleGroupsSameSize() {
        String[] input = {"ab", "ba", "cd", "dc"};
        List<List<String>> expected = Arrays.asList(
            Arrays.asList("ab", "ba"),
            Arrays.asList("cd", "dc")
        );

        assertAllEqual(expected, input);
    }

    private void assertAllEqual(List<List<String>> expected, String[] input) {
        List<List<String>> result1 = solution1.groupAnagrams(input);
        List<List<String>> result2 = solution2.groupAnagrams(input);

        assertEquals(normalize(expected), normalize(result1), "P004_0049_1 failed");
        assertEquals(normalize(expected), normalize(result2), "P004_0049_2 failed");
    }

    private List<String> normalize(List<List<String>> groups) {
        List<String> normalized = new ArrayList<>();

        for (List<String> group : groups) {
            List<String> copy = new ArrayList<>(group);
            Collections.sort(copy);
            normalized.add(String.join("|", copy));
        }

        Collections.sort(normalized);
        return normalized;
    }
}
