package linkedlist;

public  class SinglyLinkedList<E> implements ISLL<E>{
	public static class Node<E> {
		private E element;
		private Node<E> next;
		public Node(){
			element = null;
			next = null;
		}
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
	} 
	
	
	
	
	
	private int siz=0;	
	private Node<E> head = null;
	public int size() { 
		return siz;
		}
	
	public boolean isEmpty() { 
		return siz==0;
		 }
	
	public E first() {
		return head.element;
		 
	}
	public Node<E> getFirst(){
		return head;
	}
	public E last() {
		Node<E> cur = new Node<E>();
		cur = head;
		while(cur.next!= null){
			cur = cur.next;
		}
		 return cur.element;
	}
	
	public Node<E> getLast() {
		 Node<E> cur = new Node<E>();
		 cur = head;
		 while(cur.next!= null){
			 cur = cur.next;
		 }
		 return cur;
	}
	public void addFirst(E e) {	
		 if (siz==0)
			 head= new Node<E>(e,null);
		else{
		Node<E> newnode = new Node<E>(e, head);
		head = newnode;}
		 siz++;
	}
	
	public void addLast(E e) {
		if (siz==0)
			 head= new Node<E>(e,null);
		else{
			Node<E> newnode = new Node<E>(e, null);
			Node<E> lastnode = getLast();
			lastnode.next = newnode;
		}
		siz++;
	}
	
	public E removeFirst( ) {
		 if (siz == 0){
			 System.out.println("Empty Exception");
			 return null;
		 }
		 else{
			 Node<E> tempnode = head;
			 head = head.next;
			 siz--;
			 return tempnode.element;
		 }
	}
	
	public E removeLast() {
		if (siz == 0){
			 System.out.println("Empty Exception");
			 return null;
		 }
		else{
			Node<E> cur = new Node<E>();
			cur = head;
			while(cur.next.next != null)
			{
				cur = cur.next;
			}
		Node<E> tempnode = cur.next;
		cur.next = null;
		siz--;
		return tempnode.element;
		
		 
	} }
	
	public void printList(){
		 Node<E> cur = new Node<E>();
		 cur = head;
		 while(cur!= null){
			 System.out.print(cur.element + "->");
			 cur = cur.next;
		 }System.out.println("null");
	}
	public E findNode(E elt) {
		int count = 0;
		Node<E> cur = new Node<E>();
		cur = head;
		while(cur.next != null)
		{
			count++;
			if(cur.element == elt)
			{
				System.out.println("Element found at position " + count);return cur.element;
				
				
				
				
			}cur = cur.next;
		}
		System.out.println("Not found");
		return null;
		
		
	}
	public void printOdd(){
		Node<E> cur = new Node<E>();
		cur = head;
		while(cur != null)
		{
			System.out.print(cur.element + "->");
			cur = cur.next.next;
		}
		System.out.println("null");
	}
	

	
	
}

