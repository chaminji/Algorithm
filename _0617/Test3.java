package _0617;

class Node {
	int data = 0;
	Node next = null;
	
	Node(int data, Node j){
		this.data = data;
		this.next = j;
	}
}

public class Test3 {
	private Node head = null;
	
	public Test3() {
		this.head = new Node(0, null);
	}
	
	public void add(int i) {
		this.head.next = new Node(i,this.head.next);
	}
	
	public void print() {
		for(Node p = head.next; p != null; p = p.next) {
			System.out.print(p.data);
		}
	}
	
	public static void main(String[] args) {
		Test3 l = new Test3();
		l.add(3);
		l.add(5);
		l.add(4);
		l.add(2);
		l.print();
	}
}
