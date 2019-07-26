package _0311;

import java.util.Scanner;

public class _10799_pipe {
	public static void main(String[] args) {
		
		int pipe = 0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		char[] testArray = test.toCharArray();
		for (int i = 0; i < testArray.length; i++) { 
			if (testArray[i] == '(') {
				pipe += 1; 
			} else {
				if (testArray[i - 1] == '(') {
					pipe -= 1;
					total += pipe;
				} else {
				total += 1;
				pipe -= 1;
				}
			} 
		} 
		System.out.println(total);
	}
}
