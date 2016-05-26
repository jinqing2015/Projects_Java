package cn.bh.LeetCode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class IntersectionofTwoLinkedLists {
	// time limited
	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		
		if(headA == null || headB == null)
			return null;
		
		ListNode p = headA;
		while(p != null){
			ListNode q = headB;
			while(q != null){
				if(p.equals(q))
					return p;
				q = q.next;
			}
			p=p.next;
		}
		return null;
    }
	//
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		
		if(headA == null || headB == null)
			return null;
		
		ListNode p = headA;
		int lenA = 0;
		while(p != null){
			lenA ++;
			p = p.next;
		}
		
		ListNode q = headB;
		int lenB = 0;
		while(q != null){
			lenB ++;
			q = q.next;
		}
		
		p = headA;
		q = headB;
		int diff;
		if(lenA > lenB){
			diff = lenA - lenB;
			while(diff-- > 0)	p = p.next;
		}else if(lenA < lenB){
			diff = lenB - lenA;
			while(diff-- > 0)	q = q.next;
		}
		while(p != null){
			if(p.equals(q))
				return p;
			p=p.next;
			q=q.next;
		}
		return null;
    }
}
