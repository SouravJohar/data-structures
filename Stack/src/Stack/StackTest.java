package Stack;

import java.util.Stack;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		QueueFromStack Q= new QueueFromStack();
		for (int i=0;i<10;i++)
		{
		Q.enqueue(i);
		}
		Q.displayQueue();
		System.out.println("front" + Q.front());
		System.out.println("dequeue" + Q.dequeue());
		Q.displayQueue();
		for (int i=0;i<3;i++)
		{
			System.out.println(Q.dequeue());
		}
		Q.displayQueue();
		Q.dequeue();
		Q.displayQueue();
	}

}
