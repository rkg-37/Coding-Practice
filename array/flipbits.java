import java.io.*;
import java.util.*;
import java.math.*;

// kadane`s algorithm

public class flipbits {
	public static int flipBits(int[] arr,int n) {
        int cone=0,czero=0;
        int one=0,max_diff = Integer.MIN_VALUE,curr_max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1)
                one++;
            int val = (arr[i]==1)?-1:1;
            curr_max = Math.max(val,curr_max+val);
            max_diff = Math.max(max_diff,curr_max);
        }
        max_diff = Math.max(0,max_diff);
        return max_diff+one;
    }
    
    public static void main(String[] args){
        flipbits fp  = new flipbits();
        int[] arr = {1,1,0,0,1};
        int n = 5;
        int a = fp.flipBits(arr,n);
        System.out.println(a);
    }
}
