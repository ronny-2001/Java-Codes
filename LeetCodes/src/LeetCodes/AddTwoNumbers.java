/*
 You are given two non-empty linked lists representing two non-negative integers. 
 The digits are stored in reverse order, and each of their nodes contains a single digit. 
 Add the two numbers and return the sum as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 
 Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 
 Time Complexity: O(max(n1,n2)
 Space Complexity: O(n)

*/

package LeetCodes;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumy=new ListNode();
        ListNode temp=dumy;
        
        int carry=0;
        
        while(l1 != null || l2!=null || carry==1){
            int sum=0;
            if(l1 !=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            
            sum=sum+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dumy.next;
    }
}