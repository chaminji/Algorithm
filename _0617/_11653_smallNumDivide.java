package _0617;

import java.util.Scanner;

public class _11653_smallNumDivide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		func(num);
		
		
	}

	private static void func(int num) {
		for(int i = 2; num != 0; i++) {
			if (num == 1) {
				break;
			} else if(num % i == 0) {
				System.out.println(i);
				num = num / i;
				i--;
			}
		}
		
	}
}
