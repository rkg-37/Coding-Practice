import java.util.*;
import java.io.*;
class reverse_a_stack
{ 
    static void pushInStack(Stack<Integer> s,int element){
        if(s.isEmpty())
            {s.push(element);return;}
        else{
            int peekelement = s.peek();
            s.pop();
            pushInStack(s, element);
            s.push(peekelement);
        }
        
    }
    
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty())
            return;
        int element =s.peek();
        s.pop();
        reverse(s);
        pushInStack(s,element);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out=new PrintWriter(System.out);
        
        //taking testcases
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		
    		//input n and d
    	    int n=Integer.parseInt(str);
    		Stack<Integer> stack=new Stack<>();
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		//inserting elements in the array
    		for(int j=0;j<n;j++)
    		{
    		    stack.push(Integer.parseInt(starr1[j]));
    		}
    		//calling reverse() function
            reverse_a_stack.reverse(stack);
            for(int j:stack){
                out.print(j+" ");
            }
            out.println();
         }
         out.close();
    }
}