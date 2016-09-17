package queue;

public interface que<E> {
	int size();
	boolean isEmpty();
	void enqueueRight(E e);
	E dequeueLeft();
	E front();
	E rear();
	void printQueue();
	void enqueueLeft(E e);
	E dequeueRight();
}
