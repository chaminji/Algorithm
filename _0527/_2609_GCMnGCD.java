package _0527;

import java.util.Scanner;

public class _2609_GCMnGCD {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num2 > num1) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		int result = gcd(num1, num2);
		
		System.out.println(result);
		System.out.println(num1 * num2 / result);
	}

	public static int gcd(int num1, int num2) {
		if(num1 % num2 == 0)
			return num2;
		return gcd(num2, num1 % num2);
	}
}