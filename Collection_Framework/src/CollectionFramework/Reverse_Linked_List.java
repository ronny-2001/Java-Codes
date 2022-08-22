package CollectionFramework;

public class Reverse_Linked_List {
	Node head;
	private int size;
	
	//create constructor for size
	Reverse_Linked_List(){
		this.size = 0;
	}
	
	//create node
	class Node{
		int data;
		Node next;
		
		//create constructor for data 
		 Node(int data){
			this.data = data;
			this.next = null;
			size++;
		} 
	}
	
	//add first
	public void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//add last
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		//if node is exist
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	
	//print List
	public void printList() {
		if(head == null) {
			System.out.println("List is Empty....");
			return;
		}
					
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
					
		System.out.println("NULL");
	}
		
	
	//delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		size--;
		head = head.next;
	}
	
	//delete last
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secoandLast = head;	//secoandLast = first node 
		Node lastNode = head.next;	//lastNode = second Node
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secoandLast = secoandLast.next;
		}
		
		secoandLast.next = null;
	}
	
	
	public int getSize() {
		return size;
	}
	
	//Reversing Linked List using Iterative Method
	public void reverseIterate() {
		if(head == null || head.next == null) {
			return;
		}
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			//update
			prevNode = currNode;
			currNode = nextNode;
		}
		
		head.next = null;
		head = prevNode;
	}
	
	//Reversing Linked List using Recursive Method
	public Node reverseRecursive(Node head) {
		if(head == null || head.next == null ) {
			return head;
		}
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	public static void main(String[] args) {
		Reverse_Linked_List list = new Reverse_Linked_List();
		
		list.addFirst(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		
		list.printList();
		
		//Reversing List
		//list.reverseIterate();
		list.head = list.reverseRecursive(list.head);
		list.printList();
		
		//Printing the Size of List
		System.out.println(list.getSize());
	}
}