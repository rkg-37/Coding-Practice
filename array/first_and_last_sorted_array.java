import java.util.*;

class first_and_last_sorted_array {
    
    public static int binary_search(int[] nums,int start,int end,int target){
        if(end<start)
            return -1;
        int mid = (start+end)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            return binary_search(nums,mid+1,end,target);
        }else{
            return binary_search(nums,start,mid-1,target);
        }
    }
    
    public int[] searchRange(int[] nums, int target) {
        if(nums==null || nums.length==0)
            return new int[] {-1,-1};
        
        // if(nums.length==1 && nums[0]==target)
        //     return new int[] {0,0};
        
        int pos = binary_search(nums,0,nums.length-1,target);

        if(pos==-1){
            return new int[] {-1,-1};
        }else{
            int i=pos;
            while(i>0 && nums[i]==nums[i-1]){
                i--;
            }
            int j=pos;
            while(((j+1)<=nums.length-1) && nums[j]==nums[j+1] ){
                j++;
            }
            return new int[] {i,j};
        }
    }

    public static void main(String[] args){
        int[] arr = {0};
        int target = 0;
        first_and_last_sorted_array fa = new first_and_last_sorted_array();
        int[] a = fa.searchRange(arr,target);
        System.out.println(Arrays.toString(a));
    }

}

//best solution

class Solution {
    int search(int[] nums, int target ,boolean findFirstIndex){
        int ans=-1, start=0, last=nums.length-1, mid;
        while(start<=last)
        {
            mid=start+(last-start)/2;
            if(target>nums[mid])
                start=mid+1;
            else if(target<nums[mid])
                last=mid-1;
            else
            {
                ans=mid;
                if(findFirstIndex)
                    last=mid-1;
                else    
                    start=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1)
            ans[1]=search(nums,target,false);
        return ans;
    }
}