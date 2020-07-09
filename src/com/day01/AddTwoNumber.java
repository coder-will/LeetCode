package com.day01;

public class AddTwoNumber {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2)` {
	        ListNode pre = new ListNode(0);
	        ListNode cur = pre;
	        int carry = 0;
	        while(l1 != null || l2 != null) {
	            int x = l1 == null ? 0 : l1.val;
	            int y = l2 == null ? 0 : l2.val;
	            int sum = x + y + carry;
	            
	            carry = sum / 10;
	            sum = sum % 10;
	            cur.setNext(new ListNode(sum));

	            cur = cur.getNext();
	            if(l1 != null)
	                l1 = l1.getNext();
	            if(l2 != null)
	                l2 = l2.getNext();
	        }
	        if(carry == 1) {
	            cur.setNext(new ListNode(carry));
	        }
	        return pre.getNext();
	    }
}

class ListNode {
   private ListNode next;

public ListNode getNext() {
	return next;
}

public void setNext(ListNode next) {
	this.next = next;
}
}
