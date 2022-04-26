package classSamples;

import classSamples.collections.Queue;

public class QueueDriver {
	public static void main(String[] args) {
		Queue x = new Queue();
		x.enqueue("a");
		x.enqueue("b");
		System.out.println("-------------");
		System.out.println(x);
		x.dequeue();
	}
}
