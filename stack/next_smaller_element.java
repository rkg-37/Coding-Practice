import java.util.*;
class next_smaller_element {
	public static int[] solve_nse(int arr[], int n) 
	{ 
	    // Your code goes here
	    Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                ans[i] =-1;
            }else if(!s.isEmpty() && s.peek() < arr[i]){
                ans[i] = s.peek();
            }else if(!s.isEmpty() && s.peek() >= arr[i]){
                while(!s.isEmpty() && s.peek() >= arr[i]){
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
        System.out.println(Arrays.toString(solve_nse(arr,n)));
    }
}