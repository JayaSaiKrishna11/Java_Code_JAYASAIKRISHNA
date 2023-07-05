package Queuepackage;
import java.util.*;
public class Queue1 {
	public static void main(String args[]) {
		PriorityQueue<String> pq = new PriorityQueue();
		
		pq.add("Apple");
		pq.add("grapes");
		pq.add("orange");
		pq.add("banana");
		System.out.println("head: " +pq.element());
		System.out.println("the head of the queue: " +pq.peek());
		System.out.println("printing the elements of the Queue" );
		Iterator it = pq.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("After removing the head");
Iterator it2 = pq.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
