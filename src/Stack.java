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
	
	// Searches through the nodes and returns how far away it is from the top. -1 if not found, 0 if at top.
	public int search(T find) {
		Node currentNode = first;
		int counter = 0;
		while (currentNode.next != null) {
			if(currentNode.nodeData == find) {
				return counter;
			}
			counter++;
			currentNode = currentNode.next;
		}
		return -1;
	}

}
