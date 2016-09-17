package queue;

public class testQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		que<Integer> Q = new QueueFunctions<Integer>();
		int s = Q.size();
		//System.out.println("front " + Q.front());
		//System.out.println("rear " + Q.rear());
		System.out.println("size " + s);
		for (int i = 0; i<10; i++){
			Q.enqueueRight(i);
			}
		for (int i = 11; i<21; i++){
			Q.enqueueLeft(i);
			}
	System.out.println("size " + Q.size());
	System.out.println("front " + Q.front());
	System.out.println("rear " + Q.rear());
	Q.printQueue();
	System.out.println("isEmpty? " + Q.isEmpty());
	/*System.out.println("dequeued " + Q.dequeue());
	System.out.println("size" + Q.size());
	System.out.println("dequeued" + Q.dequeue());
	System.out.println("dequeued" + Q.dequeue());
	System.out.println("dequeued" + Q.dequeue());
	System.out.println("dequeued" + Q.dequeue());
	System.out.println("dequeued" + Q.dequeue());
	System.out.println("dequeued" + Q.dequeue());
	System.out.println("dequeued" + Q.dequeue());
	System.out.println("size" + Q.size());
	
	Q.printQueue();
	System.out.println("front" + Q.front());
	*/
	}

}
