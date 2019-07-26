package _0527;

import java.util.Scanner;

public class _1934_GCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int v1, v2, r;
			
			if(a<b) {
				v1 = b;
				v2 = a;
			} else {
				v1 = a;
				v2 = b;
			}
			
			do {
				r = v1 % v2;
				v1 = v2;
				v2 = r;
			} while( r > 0);
			
			System.out.println(a * b / v1);			
		}
	}
}
