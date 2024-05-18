
public class Node {
	
	private char harf;
	private Node next;

	public Node(char harf) {
		this.harf = harf;
		next = null;
	}

	public void setNext(Node next) {
		this.next = next;
	}
		
	public Node getNext() {
		return next;
	}
		
	public char getHarf() {
		return harf;
	}
	
	
	
}
