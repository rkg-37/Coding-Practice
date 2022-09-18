import java.io.*;
import java.util.*;

public class max_sum_sub_k_concat {

	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		if(k==1){
            long maxsum=Integer.MIN_VALUE;
            long sum=0;
            for(int i=0;i<n;i++){
                sum=sum+arr.get(i);
                if(maxsum<sum)
                    maxsum=sum;
                if(sum<0)
                    sum=0;
            }
            return maxsum;
        }else{
            int arrSum = 0;

            for (int i = 0; i < n; i++)
            {
                arrSum += arr.get(i);
            }

            if (arrSum <= 0)
            {   
                long maxsum=Integer.MIN_VALUE;
                long sum=0;
                for(int i=0;i<n*2;i++){
                    sum=sum+arr.get(i%n);
                    if(maxsum<sum)
                        maxsum=sum;
                    if(sum<0)
                        sum=0;
                }
                return maxsum;
            }
            else
            {
                long maxsum=Integer.MIN_VALUE;
                long sum=0;
                for(int i=0;i<n*2;i++){
                    sum=sum+arr.get(i%n);
                    if(maxsum<sum)
                        maxsum=sum;
                    if(sum<0)
                        sum=0;
                }
                return maxsum+(long)(k - 2) * (long)arrSum;
            } 
    	}
    }

    public static void main(String[] args){
        max_sum_sub_k_concat sc = new max_sum_sub_k_concat();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(50, 18, 9, 31, 0 ,-27, -48, 43 ,-37, -39 ));
        long ans = sc.maxSubSumKConcat(arr,10,9);
        System.out.println(ans);
    }
}

