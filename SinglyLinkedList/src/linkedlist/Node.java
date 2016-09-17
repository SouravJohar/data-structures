package linkedlist;

public class Node<E> {
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
