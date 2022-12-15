package com.robert.leetcode.addtwonumbers;

import lombok.Data;

/**
 * @author Robert-JQ
 * @date 2022/12/13 16:02
 */
@Data
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
