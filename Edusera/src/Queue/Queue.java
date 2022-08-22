package Queue;

public class Queue {
	int arr[];
	int CAPACITY;
	int front,rear;
	
	public Queue(int CAPACITY) {
		this.CAPACITY=CAPACITY;
		arr=new int[CAPACITY];
		rear=0;
		front=0;
	}
	
	public void enqueue(int data){
		if(rear==CAPACITY) {
			System.out.println("Queue is Full.");
		}
		
		arr[rear++]=data;
	}
	
	public void dequeue() {
		
		if(front==CAPACITY) {
			System.out.println("Queue is Empty.");
		}
		
		for(int i=0;i<rear-1;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
	}
	
	public void printQueue() {
		for(int i=front;i<rear;i++) {
			System.out.print(arr[i]+" <-- ");
		}
		System.out.println();
	}
}
