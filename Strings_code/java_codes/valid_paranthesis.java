import java.io.*;
import java.util.*;

public class valid_paranthesis{

    public boolean isValid(String s) {
        
        int a = s.length();
        if(a==0 || a%2!=0) return false;

        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<a;i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.isEmpty()) 
                    return false;
                else if( (ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')){
                    st.pop();
                }
                else
                    return false;
            }
        }
        if(st.isEmpty()) 
            return true;
        else
            return false;
        
    }

    public static void main(String[] args) throws IOException{
        // BufferedReader = br = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Enter string ");    
        String s=br.readLine(); 
        valid_paranthesis vp = new valid_paranthesis();
        boolean a = vp.isValid(s);
        System.out.println(a);
    }
}