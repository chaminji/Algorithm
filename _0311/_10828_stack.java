package _0311;
import java.util.*;

public class _10828_stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			String str = sc.next();
			if(str.equals("push")) {
				int data = sc.nextInt();
				stack.push(data);
			} else if(str.equals("pop")) {
				if(stack.isEmpty()) {System.out.println("-1");}
				else{System.out.println(stack.pop());}
			} else if(str.equals("size")) {
				System.out.println(stack.size());
			} else if(str.equals("empty")) {
				if(stack.isEmpty()) {System.out.println("1");}
				else {System.out.println("0");}
			} else if(str.equals("top")) {
				if(stack.isEmpty()) {System.out.println("-1");}
				else {System.out.println(stack.peek());}
			}
		}
	}
}