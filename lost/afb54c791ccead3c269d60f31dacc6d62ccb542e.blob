import java.util.*;
import java.lang.*;
public class bubblesort{
    public static void solve(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        solve(arr,n);
    }
}


// 5,4,3,1,2
// 4,5,3,1,2
// 4,3,5,1,2
// 4,3,1,5,2
// 4,3,1,2,5