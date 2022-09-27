// Given an array of integers, find the closest (not considering distance, but value) greater 
// on left of every element. If an element has no greater on the left side, print -1 . 
import java.util.*;
public class nearest_greater_left{

    public static int[] solve_bs(int[] arr,int n){
        Stack<Integer> s = new Stack<Integer>();
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                ans[i]=-1;
            }else if(!s.isEmpty() && s.peek() > arr[i]){
                ans[i] = s.peek();
            }else if(!s.isEmpty() && s.peek() <= arr[i]){
                while(!s.isEmpty() && s.peek() <= arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i] = -1;
                }else{
                    ans[i] = s.peek();
                }
            }
            s.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(solve_bs(arr,n)));
    }
}