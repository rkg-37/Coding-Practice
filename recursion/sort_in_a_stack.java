import java.util.*;
import java.lang.*;

class sort_in_a_stack{
    public void SortAnStack(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int element= stack.peek();
        stack.pop();
        SortAnStack(stack);
        PushBackIntoStack(stack, element);
    }

    public void PushBackIntoStack(Stack<Integer> stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        if(stack.peek() > element){
            int peekElement  = stack.peek();
            stack.pop();
            PushBackIntoStack(stack, element);
            stack.push(peekElement);
        }
        else{
            stack.push(element);
        }
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		 SortAnStack(s);
         return s;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			sort_in_a_stack g=new sort_in_a_stack();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
    }

}