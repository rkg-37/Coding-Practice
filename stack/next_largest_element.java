// Nearest Greater to right | Next Largest Element
import java.util.*;
public class next_largest_element{
    public static void solve_brute_force(int[] arr,int n){
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=i+1;j<n;j++){
                if(arr[i] < arr[j]){
                    flag=1;
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(flag==0)
                System.out.println(-1+" ");
        }
    }
    public static int[] solve_best_solution(int[] arr,int n){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                ans[i] = -1;
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
    public static int[] nextLargerElement(int[] arr, int n)
    { 
        // Your code here
        Stack<Integer> s = new Stack<>();
        int[] nge = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                nge[i] = s.peek();
            }
            else{
                nge[i] = -1;
            }
            s.add(arr[i]);
        }
        return nge;
    } 

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        // solve_brute_force(arr,n);
        System.out.println(Arrays.toString(solve_best_solution(arr,n)));
    }
}