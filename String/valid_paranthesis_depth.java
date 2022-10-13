import java.io.*;
import java.util.*;

class valid_paranthesis_depth {
    public static int maxDepth(String s) {
        // code here
        int n =s.length();
        int counter = 0;
        int max=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                counter++;        
                if(max<counter)
                    max = counter;
            }
            else if(ch==')'){
                counter--;
            }
            
        }
        return max;
        
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            String s;
            s = sc.next();
            
            
            int res = maxDepth(s);
            
            System.out.println(res);
            
        }
    }
}
