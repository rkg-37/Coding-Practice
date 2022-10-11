import java.util.*;
import java.lang.*;
public class findmin{

    public static int bs(int[] arr,int s,int e){
        while(s<=e){
            int m = s+(e-s)/2;
            
            if(arr[m] < arr[e])
                e=m;
            else
                s = m+1;

        }
        return e;
    }

    public static int solve(int[] arr,int n){
        return bs(arr,0,n-1);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        System.out.println(solve(arr,n));
    }
}