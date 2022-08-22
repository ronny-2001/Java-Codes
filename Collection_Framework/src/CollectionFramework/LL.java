package CollectionFramework;
import java.util.*;

public class LL {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.addLast("Hello");
		list.addLast("My Name is");
		list.addLast("Rohan Dhawale");
		
		System.out.println(list);
		System.out.println(list.size());
	}
}