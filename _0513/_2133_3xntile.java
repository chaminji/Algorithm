package _0513;
import java.util.*;

public class _2133_3xntile {
    static int[] tile;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tile = new int[n + 1];

        int answer = 0;
        if (n % 2 == 0) {
        	tile[2] = 3;
        	tile[0] = 1;
            for (int i = 4; i <= n; i += 2) {
                for (int j = 2; j <= i; j += 2) {
                    int standard = j == 2 ? 3 : 2;
                    tile[i] += standard * tile[i - j];
                }
            }
            answer = tile[n];
        }
        System.out.println(answer);
    }	
}