// 1 D array

import java.util.*;
public class prefix_suffix_sum{

    public static int[] prefix_sum(int[] arr,int n){
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        return prefix;
    }

    public static int[] suffix_sum(int[] arr,int n){
        int[] suffix = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]+arr[i];
        }
        return suffix;
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,7,9};
        int[] a = prefix_sum(arr,arr.length);
        int[] b = suffix_sum(arr,arr.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}