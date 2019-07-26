package _0318;

import java.util.*;
import java.io.*;
 
public class _1406_editor {
 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String def = br.readLine();
 
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack_R = new Stack<>();
         
        for(int i=0; i<def.length(); i++) {
            stack.push(def.charAt(i));
        }        
        
        int sq_num = Integer.parseInt(br.readLine());
     
        while(sq_num-- > 0) {
            String cmd = br.readLine();
   
            if(cmd.equals("L")) {
                if(!stack.empty()) {
                    stack_R.push(stack.pop());
                }
 
            }else if(cmd.equals("D")) {
                if(!stack_R.empty()) {
                    stack.push(stack_R.pop());
                }
            }else if(cmd.equals("B")) {
                if(!stack.empty()) {
                    stack.pop();
                }
            }else if(cmd.contains("P")) {
                char x = cmd.charAt(2);
                stack.push(x);
            }            
        }
 
        while(!stack.empty()) {
            stack_R.push(stack.pop());
        }
 
        StringBuilder sb = new StringBuilder();
        while(!stack_R.empty()) {
            sb.append(stack_R.pop());
        }
        System.out.println(sb);
    }
}