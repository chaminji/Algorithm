package _0617;

import java.util.Scanner;

public class _1676_factorialCnt0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i = 5; i <= num; i *= 5) {
			cnt += num / i;
		}
		System.out.println(cnt);
	}
}