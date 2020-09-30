import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> stack= new LinkedList<T>();
	
	

	public Stack(){
		
	}
	
	public boolean isEmpty() {
		return (stack.isEmpty());
	}
	
	public void push(T data) {
		stack.add(0, data);
	}
	
	public T pop() {
		if(isEmpty()){
			return null;
		}
		else{
			T storage = stack.get(0);
			stack.remove(0);
			return storage;
		}
	}
	
	public T peek() {
		return stack.get(0);
	}

}
