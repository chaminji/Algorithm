package _0415;

import java.util.Scanner;

public class _1463_making1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		
		while(num > 1) {
			if(num == 1) {
				break;
			} else if((num - 1) % 3 == 0) {
				num -= 1;
				cnt++;
			} else if(num % 3 == 0) {
				num /= 3;
				cnt++;
			} else if(num % 2 == 0) {
				num /= 2;
				cnt++;
			} else {
				num -= 1;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
