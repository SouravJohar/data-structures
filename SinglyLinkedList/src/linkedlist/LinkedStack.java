package linkedlist;
//Stack using a linked list
public class LinkedStack {

	ISLL<Integer> list = new SinglyLinkedList<Integer>();
	public void push(int e){
		list.addFirst(e);
	}
	public void pop(){
		System.out.println("Popped:" + list.removeFirst());
	}
	public void displayStack(){
		list.printList();
	}
	public void top(){
		System.out.println("Top:" + list.first());
	}
}
