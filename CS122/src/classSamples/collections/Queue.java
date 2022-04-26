package classSamples.collections;

import java.util.LinkedList;

public class Queue {

	LinkedList<String> theQueue;
		
	public Queue() {
		this.theQueue = new LinkedList<String>();
	
	}
	
	public void enqueue(String s) {
		// adding to the end of the LinkedList
		theQueue.add(s);
	}
	
	public String dequeue() {
		
		return theQueue.removeFirst();
		
	}
	
	public String peek() {
		return theQueue.peek();
	}
	
	public boolean empty() {
		return theQueue.isEmpty();
	}
	
	
	
}
