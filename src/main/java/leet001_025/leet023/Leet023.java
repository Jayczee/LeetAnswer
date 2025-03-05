package leet001_025.leet023;

import pojo.ListNode;

import java.util.Arrays;
import java.util.Objects;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet023 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (Arrays.stream(lists).anyMatch(Objects::nonNull)) {
            int minVal = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                } else if (lists[i].val <= minVal) {
                    minVal = lists[i].val;
                    minIndex = i;
                }
            }
            cur.next = lists[minIndex];
            cur = cur.next;
            lists[minIndex] = lists[minIndex].next;
        }
        return head.next;
    }
}
