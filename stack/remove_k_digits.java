//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class remove_k_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("t then number then digits");
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String S, int k) {
        // code here
        Stack<Character> stack = new Stack<>();
        int n = S.length();
        for(int i=0;i<n;i++){
            char ch = S.charAt(i);
            while(k>0 && !stack.isEmpty() && stack.peek() > ch){
                stack.pop();
                k--;
            }
            if(stack.isEmpty() && ch=='0')
                continue;
            stack.push(ch);
        }
        
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        
        if(stack.isEmpty())
            return "0";
            
        StringBuilder sb = new StringBuilder("");
        while(!stack.isEmpty()){
            sb.append(stack.peek());
            stack.pop();
        }
        
        return sb.reverse().toString();
    }
}