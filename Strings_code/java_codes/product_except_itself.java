import java.util.*;
public class product_except_itself{

    // naive approach 
    // public int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int[] ans = new int[n];
    //     if(Arrays.equals(ans,nums))
    //             return nums;
    //     int prod=1;
    //     int flag=0;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]==0){
    //             flag++;
    //         }else{
    //             prod=prod*nums[i];
    //         }
    //     }
        
    //     if(flag==0){
    //         for(int i=0;i<n;i++){
    //             ans[i] = prod/nums[i];
    //         }    
    //     }else if(flag==1){
    //         for(int i=0;i<n;i++){
    //             if(nums[i]==0)
    //                 ans[i]=prod;
    //         }
    //     }
            
            
    //     return ans;
    // }


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];

        for(int i=1,j=n-2;i<n && j>=0;j--,i++){
            prefix[i] = prefix[i-1]*nums[i];
            suffix[j] = suffix[j+1]*nums[j];
        }

        ans[0] = suffix[1];
        ans[n-1] = prefix[n-2];
        for(int i=1;i<n-1;i++){
            ans[i] = prefix[i-1] * suffix[i+1];
        }

        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));
        // System.out.println(Arrays.toString(ans));

        
        
        return ans;
    }


    public static void main(String[] args){
        product_except_itself ps = new product_except_itself();
        System.out.println(Arrays.toString(ps.productExceptSelf(new int[] {1,2,3,4})));
    }
}