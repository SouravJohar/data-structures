package Stack;

public class StackArray<E> implements stack<E> {
public static final int CAPACITY=100;
private E[] data;
private int t=-1;
	public StackArray(){ this(CAPACITY);}
	public StackArray(int capacity) {
		// TODO Auto-generated constructor stub
		data=(E[]) new Object[capacity];
	}
	public int size() {
		return t+1;
		
	}

	public boolean isEmpty() {
		if (t==0)
		{
			return true;
		}
		else
			return false;
	}

	public void push(E e) {
		t = t+1;
		data[t] = e;
		
		
	}

	public E top() {
		return data[t];
		
	
	}

	public E pop() {
		int temp = t;
		t = t-1;
		return data[temp];
		
	}
	
	public void printStack(){
		for (int i = 0; i<t+1; i++)
			System.out.print(data[i]+ " ");
		System.out.println("\n");
	}

}
