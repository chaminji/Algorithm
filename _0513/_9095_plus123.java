package _0513;

import java.util.Scanner;

public class _9095_plus123 {
  public static void main(String[] args) {
    int[] arr = new int[11];
    int T, n;
    Scanner scanner = new Scanner(System.in);
     
    arr[0] = 0;
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 4;
    T = scanner.nextInt();
    for(int i = 0; i < T; i++) {
      n = scanner.nextInt();
      for(int j = 4; j <= n; j++){
        arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
      }
      System.out.println(arr[n]);
    }
    scanner.close();
  }
		
}
