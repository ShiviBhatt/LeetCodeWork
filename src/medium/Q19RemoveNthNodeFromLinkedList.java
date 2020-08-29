package medium;

//remove second last node from the list and print the list
public class Q19RemoveNthNodeFromLinkedList {
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode slow = dummy; // initially pointing to dummy
		ListNode fast = dummy; // initially pointing to dummy
		while (fast.next != null) {
			fast = fast.next;
			if (n-- <= 0) {
				slow = slow.next;
			}
		}
		slow.next = slow.next.next;
		return dummy.next;
	}

}
