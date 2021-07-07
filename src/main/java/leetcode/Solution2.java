package leetcode;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = solution.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.value);
            result = result.next;
        }
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(l1.value + l2.value);
        ListNode current = head;

        while (l1.next != null || l2.next != null) {
            l1 = (l1.next != null) ? l1.next : new ListNode();
            l2 = (l2.next != null) ? l2.next : new ListNode();
            current.next = new ListNode(l1.value + l2.value + current.value / 10);
            current.value = current.value % 10;
            current = current.next;
        }
        if (current.value >= 10) {
            current.next = new ListNode(current.value / 10);
            current.value = current.value % 10;
        }
        return head;
    }

    public static class ListNode {
        int value;
        ListNode next;

        ListNode() {
        }

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
