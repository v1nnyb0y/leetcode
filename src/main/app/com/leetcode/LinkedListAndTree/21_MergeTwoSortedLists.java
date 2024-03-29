package com.leetcode.LinkedListAndTree;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution100 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(-1); // sentinel
        ListNode ptr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ptr.next = l1;
                l1 = l1.next;
            } else {
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }

        while (l1 != null) {
            ptr.next = l1;
            ptr = ptr.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            ptr.next = l2;
            ptr = ptr.next;
            l2 = l2.next;
        }

        return dummy.next;
    }
}