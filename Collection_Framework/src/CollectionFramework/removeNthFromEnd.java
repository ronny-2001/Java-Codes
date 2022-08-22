package CollectionFramework;
import java.util.List;

public class removeNthFromEnd {
	public ListNode remove_Nth_From_End(ListNode head, int n) {
		if(head == null || head.next == null) {
			return head;
		}
		
		//calculating size
		int size = 0;
		ListNode curr = head;
 		while(curr != null) {
 			curr = curr.next;
			size++;
		}
 		
 		if(n == size) {	//n = 5,size = 5 means we travel from last node to first and delete the first node and return head.next (means 2nd) node.
 			return head.next;
 		}
		
 		//deleting nth node by using it's previous node 
		int indexToSearch = size - n;
		ListNode prev = head;
		int i = 1;
		while(i < indexToSearch) {
			prev = prev.next;
			i++;
		}
		
		//previous node pointing to next to next node
		prev.next = prev.next.next;
		return head;
	}
}
