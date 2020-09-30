
public class Node<T> {
	
	T nodeData;
	Node<T> next;
	
	public Node(T data, Node<T> next) {
		this.nodeData = data;
		this.next = next;
	}
	
}
