package leetcode.linkedlist;

/**
 * 206. 反转链表
 *
 * 题目链接：https://leetcode.cn/problems/reverse-linked-list/description/
 *
 * 题目描述：
 *   给定单链表的头节点 head，反转链表并返回新的头节点。
 *
 * 讲解笔记：notes/05-数据结构/链表/4.反转链表.md
 *
 * 解题思路：
 *   解法一（迭代）：三指针 pre/cur/tmp，逐个把 next 指向前驱。
 *   解法二（递归）：reverseList(head.next) 后把下一个节点接回来。
 *
 * 复杂度分析：
 *   时间复杂度 O(n)
 *   空间复杂度 O(1)（迭代）/ O(n)（递归栈）
 */
public class L206_ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    /** 解法一：迭代（双指针） */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    /** 解法二：递归 */
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        L206_ReverseLinkedList solution = new L206_ReverseLinkedList();
        ListNode head = build(new int[]{1, 2, 3, 4, 5});
        print(solution.reverseList(head));            // 5 4 3 2 1
        head = build(new int[]{1, 2, 3, 4, 5});
        print(solution.reverseListRecursive(head));   // 5 4 3 2 1
    }

    /** 工具方法：数组建链表 */
    static ListNode build(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : vals) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    /** 工具方法：打印链表 */
    static void print(ListNode head) {
        StringBuilder sb = new StringBuilder();
        for (ListNode p = head; p != null; p = p.next) {
            sb.append(p.val).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
