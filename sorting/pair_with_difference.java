import java.util.*;
public class pair_with_difference{
    public static boolean findPair(int arr[], int size, int n)
    {
        
        Arrays.sort(arr);
        HashSet<Integer> map = new HashSet<>();
        for(int i=size-1;i>=0;i--){
            int val = n+arr[i];
            if(map.contains(val))
                return true;
            else
                map.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args){
        int L = 5, N = 45;
        int[] arr = {90, 70, 20, 80, 50};
        System.out.println(findPair(arr,L,N));
    }
}




        // Arrays.sort(arr);
        // int start = 0,end = size-1;
        // while(end>=start){
        //     if(arr[end]-arr[start] == n)
        //         return true;
        //     else if(arr[end]-arr[start]<n){
        //         start++;
        //     }else{
        //         end--;
        //     }
        // }
        // return false;