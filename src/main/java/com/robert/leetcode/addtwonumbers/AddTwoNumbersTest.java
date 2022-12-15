package com.robert.leetcode.addtwonumbers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @desc 两数相加 https://leetcode.cn/problems/add-two-numbers/
 * @author Robert-JQ
 * @date 2022/12/13 15:35
 */
@Slf4j
public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbersTest() {
        ListNode l1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node2.setNext(node3);
        l1.setNext(node2);
        ListNode l2 = new ListNode(5);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(4);
        node4.setNext(node5);
        l2.setNext(node4);
        log.info("l1:{} l2:{} addTwoNumbers:{}", l1, l2, addTwoNumbers1(l1, l2));
    }

    /**
     * @desc 解法一：逐位相加
     * @author Robert-JQ
     * @date 2022/12/15 16:06
     * @param l1
     * @param l2
     * @return com.robert.leetcode.addtwonumbers.ListNode
     */
    private ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode t = node;
        int sum = 0;
        while (n1 != null || n2 != null) {
            sum /= 10;
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            t.next = new ListNode(sum % 10);
            t = t.next;
        }
        if (sum / 10 != 0) {
            t.next = new ListNode(1);
        }
        return node.next;
    }

}
