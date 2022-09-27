import java.util.*;
public class nearest_smallest_left{ 
    public static int[] solve_nsl(int[] arr,int n){
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(solve_nsl(arr,n)));
    }
}