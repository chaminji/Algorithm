package _0415;

import java.util.Scanner;

public class _11726_2xntile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		while(true) {
			i=sc.nextInt();
	
			Fibonacci f = new Fibonacci();
			System.out.println(f.fibR(i+1));
		}
	}
}


class Fibonacci {

	public int fibR(int n)	{
		int fn2,fn1,fn=n;
		
		if(n<0)
			return -1;
		if(n<=1)
			return n;
		else{
		fn2 = 0;
		fn1 = 1;
		}
		
		for(int i=2;i<=n;i++){
			fn = fn1 + fn2;
			fn2 = fn1;
			fn1= fn;
		}
		return fn;
	}
}