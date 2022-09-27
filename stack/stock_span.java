import java.util.*;

public class stock_span{
    public static int[] solve_stock_span(int[] arr,int n){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++){
            int c=0;
            for(int j=i-1;j>=0;j--){
                if(arr[j] > arr[i]){
                    break;
                }
                c++;
            }
            ans[i] = c+1;
        }
        return ans;
    }

    public static int[] solve_ngl_stock_span(int[] arr,int n){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                ans[i] = 1;
            }else if(!s.isEmpty() && arr[s.peek()] > arr[i]){
                ans[i] = 1;
            }else if(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i] = i+1;
                }else{
                    ans[i] = i-s.peek();
                }
            }
            s.push(i);
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
        System.out.println(Arrays.toString(solve_stock_span(arr,n)));
        System.out.println(Arrays.toString(solve_ngl_stock_span(arr,n)));
    }
}