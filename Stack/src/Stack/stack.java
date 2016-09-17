package Stack;

public interface stack<E> {

int size();
boolean isEmpty();
void push(E e); 
E pop(); 
E top();
void printStack();
}