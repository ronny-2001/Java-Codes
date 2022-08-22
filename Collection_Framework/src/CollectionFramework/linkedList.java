package CollectionFramework;

public class linkedList {
	Node head;
	private int size;
	
	//create constructor for size
	linkedList(){
		this.size = 0;
	}
	
	//create node
	class Node{
		String data;
		Node next;
		
		//create constructor for data 
		 Node(String data){
			this.data = data;
			this.next = null;
			size++;
		} 
	}
	
	//add first
	public void addFirst(String data){
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//add last
	public void addLast(String data) {
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
	
	
	public static void main(String[] args) {
		linkedList list = new linkedList();
		
		list.addFirst("My Name is");
		list.addFirst("Hello");
		list.addLast("Rohan Dhawale");
		
		list.printList();
		list.deleteFirst();
		list.printList();
		
		System.out.println(list.getSize());
	}
}