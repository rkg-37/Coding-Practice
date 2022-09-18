import java.io.*;
import java.util.*;

public class Sum3Sum{
    // incorrect not all test cases
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> arr = new ArrayList<>();
        if(n==3 && nums[0]+nums[1]+nums[2] == 0){
            arr.add(new ArrayList<>(Arrays.asList(new Integer[]{nums[0],nums[1],nums[2]})));
            return arr;
        }
        
        Arrays.sort(nums);
        for(int i=0;i<=n-3;i++){
            int l = i+1;
            int r = n-1;
            while(l<r && l!=r && l!=i && r!=i){
                int val = nums[i]+nums[l]+nums[r];
                if(val == 0){
                    ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(new Integer[]{nums[i],nums[l],nums[r]}));
                    if(!arr.contains(ar))
                        arr.add(ar);    
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    
                    l++;
                    r--;
                    
                }else if(val > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return arr;     
    }

    // 40 ms solution
    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int target =0;
        
        for(int i=0; i<=nums.length-3 ; i++){
            // if num is same as previous, do nth
            if(i==0 || (i>0 && nums[i] != nums[i-1]) ){
                int sum = target - nums[i];
                int s = i+1 , e= nums.length-1;
                
                while(s<e){
                    int var_sum = nums[s] + nums[e];
                    if(var_sum == sum){
                        List<Integer> list = Arrays.asList(nums[i] , nums[s], nums[e]);
                        res.add(list);
                        // if duplicates present
                        while(s<e && nums[s]==nums[s+1]) s++;
                        while(s<e && nums[e]==nums[e-1]) e--;
                        
                        s++;
                        e--;
                    }
                    else if (var_sum > sum)
                        e--;
                    else
                        s++;
                }
           }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> arr = threeSum(nums);
        System.out.println(arr);
        arr = threeSum2(nums);
        System.out.println(arr);
    }
}