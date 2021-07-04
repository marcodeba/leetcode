package leetcode;

public class Solution2 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(l1.val + l2.val);
        ListNode cur = head;

        while (l1.next != null || l2.next != null) {
            l1 = (l1.next != null) ? l1.next : new ListNode();
            l2 = (l2.next != null) ? l2.next : new ListNode();
            cur.next = new ListNode(l1.val + l2.val + cur.val / 10);
            cur.val = cur.val % 10;
            cur = cur.next;
        }

        if (cur.val >= 10) {
            cur.next = new ListNode(cur.val / 10);
            cur.val = cur.val % 10;
        }

        return head;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = solution2.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
