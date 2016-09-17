package Stack;

public class QueueFromStack {
	stack<Integer> S= new StackArray<Integer>();
	stack<Integer> temp= new StackArray<Integer>();
	public void enqueue(int e){
		S.push(e);
	}
	public int dequeue(){
		int s = S.size();
		for (int i =0; i <s; i++)
			temp.push(S.pop());
		int t = temp.pop();
		int d = temp.size();
		for (int i =0; i < d; i++)
			S.push(temp.pop());
		return t;
		
	}
	public int front(){
		System.out.println("size: "+ S.size());
		int s = S.size();
		for (int i =0; i<s; i++)
			temp.push(S.pop());
		int t = temp.top();
		int d = temp.size();
		for (int i =0; i<d; i++)
			S.push(temp.pop());
		return t;
		
		
		
	}
	public void displayQueue(){
		S.printStack();
	}

}
