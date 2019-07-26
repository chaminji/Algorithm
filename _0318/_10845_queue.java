package _0318;

import java.util.*;

public class _10845_queue{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Queue<Integer> que = new LinkedList<>();
		int b=0;
	    int cnt = sc.nextInt();
	    for(int i=0; i<cnt; i++) {
    	
	    	String a = sc.next();
	    	if(a.equals("push")) {
	    		b = sc.nextInt();
	    		que.add(b);
	    	}else if(a.equals("front")){
	    		System.out.println(que.isEmpty()?-1:que.peek());
	    	}else if(a.equals("back")) {
	    		System.out.println(que.isEmpty()?-1:b);
	    	}else if(a.equals("size")) {
	    		System.out.println(que.size());
	    	}else if(a.equals("pop")) {
	    		System.out.println(que.isEmpty()?-1:que.poll());
	    	}else if(a.equals("empty")) {
			    System.out.println(que.isEmpty()?1:0);
		    }
	    }
	}
}