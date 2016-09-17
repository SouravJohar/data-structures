package linkedlist;

public class oddPrint {

	public static void main(String[] args) {
		ISLL<Integer> list = new SinglyLinkedList<Integer>();
		for(int i =1;i<25; i++){
			list.addLast(i);
		}
		
		list.printOdd();
		

	}

}
