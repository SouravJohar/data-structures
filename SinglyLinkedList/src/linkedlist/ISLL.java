package linkedlist;

public interface ISLL<E>{
	int size();
	boolean isEmpty();
	E first();
	Object getFirst();
	Object getLast();
	E last();
	void addFirst(E e);
	void addLast(E e);
	E removeFirst();
	E removeLast();
	void printList();
	E findNode(E e);
	void printOdd();
	
}



