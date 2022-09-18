import java.util.* ;
import java.io.*; 

public class maximum_subarray_kadane {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxsum=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(maxsum<sum)
                maxsum=sum;
            if(sum<0)
                sum=0;
        }
        return (maxsum<0)?0:maxsum;
	}
    public static void main(String[] args){
        maximum_subarray_kadane sm = new maximum_subarray_kadane();
        //int[] arr = {2,3,-4,4,-2,-1};
        //int n=6;
        int n = 15;
        int[] arr = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16 ,-10 };
        long a = sm.maxSubarraySum(arr,n);
        System.out.println(a);

    }

}
