public class Stack<T> {
	
	private class Node {
		
		T nodeData;
		Node next;
		public Node() {
			this.nodeData = null;
			this.next = null;
		}
		
		public Node(T data, Node next) {
			this.nodeData = data;
			this.next = next;
		}
		
	}

	
	private Node first;
	
	

	public Stack(){
		this.first = new Node();
	}
	
	public boolean isEmpty() {
		if (first.nodeData == null) {
			return true;
		}
		return false;
	}
	
	public void push(T data) {
		Node newnode = new Node(data, first);
		first = newnode;
	}
	
	public T pop() {
		if(isEmpty()){
			return null;
		}
		else{
			T storage = first.nodeData;
			first = first.next;
			return storage;
		}
	}
	
	public T peek() {
		return first.nodeData;
	}

}
