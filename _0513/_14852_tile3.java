package _0513;

import java.io.*;
import java.util.*;
public class _14852_tile3 { 
	
	private static final int MOD = (int)(1e+9)+7; 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int N = Integer.parseInt(br.readLine()); 
		long dp[] = new long[N+10]; 
		long dp2[] = new long[N+10]; 
		
		dp[1] = 2; 
		dp[2] = 7; 
		dp[3] = 22; 
		dp2[3] = 1; 
		
		for(int i = 4; i<=N; i++){ 
			dp2[i] = (dp2[i-1] + dp[i-3]) % MOD; 
			dp[i] = (dp[i-2]*3 + dp[i-1]*2 + dp2[i]*2) % MOD; 
		}
		
		System.out.println(dp[N]); 
	} 
}