package queue;

public class QueueFunctions<E> implements que<E>{
	public static final int CAPACITY=100;
	private E[] data;
	private int front = CAPACITY/2;
	private int rear = CAPACITY/2 +1;
	private int siz = 0;
	public QueueFunctions() { this(CAPACITY);}
	@SuppressWarnings("unchecked")
	public QueueFunctions(int capacity) {
		data=(E[]) new Object[capacity];
	}
	public int size(){
		return siz;
		
	}
	public boolean isEmpty()
	{
		if (siz==0)
		{
			return true;
		}
		else
			return false;
	}
	public void enqueueLeft(E e){
	
		if (front == 0){
			System.out.println("No more space in front of the queue.");
		}
		else{
		
		data[front] = e;
		front = (front -1);
		siz = siz+1;
	}
		
		
	}
	public void enqueueRight(E e){
		if (rear == 99){
			System.out.println("No more spce behind the queue.");
		}
		else{
		data[rear] = e;
		rear = rear +1;
		siz = siz +1;
	}}
	public E dequeueLeft(){
		
		
		
		
		int temp = front;
		
		front = (front +1);
		siz = siz-1;
		return data[temp];
		}
	public E dequeueRight(){
		int temp = rear;
		rear = rear -1;
		siz = siz -1;
		return data[temp];
		
	}
	
	
    public E front(){
    	return data[front+1];
    }
    public E rear(){
    	return data[rear-1];
    }
    
    
    public void printQueue(){
    	for (int i = front+1; i< front + siz+1; i++ )
    	{
    		System.out.print(data[i] + " ");
    	}
    }
    
    
    }
