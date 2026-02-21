package com.carro.leetcode.solutions.p0876;

class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         List<ListNode> list = new ArrayList<>();
//         ListNode curNode = head;
//         while(curNode != null) {
//             list.add(curNode);
//             curNode = curNode.next;
//         }
//         return list.get(list.size() / 2);
//     }
// }
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode curNode = head;
//         int length = 1;
//         while(curNode.next != null) {
//             length++;
//             curNode = curNode.next;
//         }
//         int middle = length / 2 + 1;
//         ListNode result = head;
//         for (int i = 0; i < middle -1; i++) {
//             result = result.next;
//             System.out.println(result);
//         }
//         return result;
//     }
// }
