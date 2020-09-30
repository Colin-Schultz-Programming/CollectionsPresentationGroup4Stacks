public class Stack<T> {
	
	private class Vector {
		
		T VectorData;
		Vector next;
		public Vector() {
			this.VectorData = null;
			this.next = null;
		}
		
		public Vector(T data, Vector next) {
			this.VectorData = data;
			this.next = next;
		}
		
	}

	
	private Vector first;
	public Stack(){
		this.first = new Vector();
	}
	
	public boolean isEmpty() {
		if (first.VectorData == null) {
			return true;
		}
		return false;
	}
	
	public void push(T data) {
		Vector newVector = new Vector(data, first);
		first = newVector;
	}
	
	public T pop() {
		if(isEmpty()){
			return null;
		}
		else{
			T storage = first.VectorData;
			first = first.next;
			return storage;
		}
	}
	
	public T peek() {
		return first.VectorData;
	}
	
	// Searches through the Vectors and returns how far away it is from the top. -1 if not found, 0 if at top.
	public int search(T find) {
		Vector currentVector = first;
		int counter = 0;
		while (currentVector.next != null) {
			if(currentVector.VectorData == find) {
				return counter;
			}
			counter++;
			currentVector = currentVector.next;
		}
		return -1;
	}

}
