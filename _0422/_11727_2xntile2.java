package _0422;

import java.util.Scanner;

public class _11727_2xntile2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine().trim());
        
        long array[] = new long[input + 1];
        array[0] = 1;
        array[1] = 1;
        
        if(input == 0 || input == 1) {
            System.out.println(1);
            
            return;
        }
                
        for(int i=2; i <= input; i++) {
            array[i] = (array[i - 1] + (array[i - 2] * 2)) % 10007;
        }
        
        System.out.println(array[input]);
        
        scan.close();
	}
}
