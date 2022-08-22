package Queue;

public class queueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.dequeue();
		q.printQueue();
	}

}
