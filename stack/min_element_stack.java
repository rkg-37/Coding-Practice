// using extra space min-stack
import java.util.*;

public class min_element_stack{
    
    static Stack<Integer> s = new Stack<>();
    static Stack<Integer> ss = new Stack<>();

    public static void push_(int x){
        if(s.isEmpty() || ss.peek() > x)
            ss.push(x);
        s.add(x);
    }  

    public static int getMin(){
        return ss.peek();
    }

    public static int pop_(){
        if(s.isEmpty())
            return -1;
        int x = s.pop();
        if(x==ss.peek())
            ss.pop();
        return x;
    }

    public static void min_element_stack(int[] arr){
        push_(arr[0]);
        push_(arr[1]);
        push_(arr[2]);
        System.out.println("min :"+getMin());
        push_(arr[3]);
        System.out.println(pop_());
        System.out.println(pop_());
        push_(arr[4]);
        System.out.println("min :"+getMin());
        
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = 5;
        int[] arr = {18,19,29,15,16};
        min_element_stack(arr);
    }
}