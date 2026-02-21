package com.carro.leetcode.solutions.p0876;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsMiddleForOddLengthList() {
        ListNode head = buildList(1, 2, 3, 4, 5);

        ListNode middle = solution.middleNode(head);

        assertEquals(3, middle.val);
    }

    @Test
    void returnsSecondMiddleForEvenLengthList() {
        ListNode head = buildList(1, 2, 3, 4, 5, 6);

        ListNode middle = solution.middleNode(head);

        assertEquals(4, middle.val);
    }

    @Test
    void returnsHeadForSingleNodeList() {
        ListNode head = buildList(42);

        ListNode middle = solution.middleNode(head);

        assertEquals(42, middle.val);
    }

    private ListNode buildList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
}
