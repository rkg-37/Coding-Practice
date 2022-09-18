
public class rotated_sorted_array {

   public static int binary_search(int[] arr,int start,int end,int key){
        if(end<start) 
            return -1;
        
        int mid = start+(end-start)/2;
        if(arr[mid]==key)
            return mid;
        else if(arr[mid]<key){
            return binary_search(arr,mid+1,end,key);
        }else{
            return binary_search(arr,start,mid-1,key);
        }
    }


    public static int search(int arr[], int key) {
        int k=0, pos=-1;
        while(k<arr.length-1){
            if(arr[k]>arr[k+1]){
                pos=k;
                break;
            }
            k++;
        }
        if(pos==-1)
            return binary_search(arr,0,arr.length-1,key);

        if(arr[pos]==key)
            return k;
        if(key>=arr[0] && key<=arr[pos]){
            return binary_search(arr,0,pos-1,key);
        }else{
            return binary_search(arr,pos+1,arr.length-1,key);
        }
        
    }
    
    public static void main(String[] args){
        rotated_sorted_array ms = new rotated_sorted_array();
        //int[] arr = {0, 1, 3, 4, 5, 9, 10, 12, 13 ,-1};
        int[] arr = {4, -1, 0 ,2 ,3};
        //int[] q = {-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] q = {1,-5,4,0,3};
        for(int i=0;i<q.length;i++){
            int a = ms.search(arr,q[i]);
            System.out.println(a);
        }
    }

}



// new approach 

public class Solution {
   public static int search(int[] nums, int target) {
        int start=0;
    int end=nums.length-1;
    int mid=0;
    if(target == nums[0]) {
        return 0; 
    }
    if(target == nums[nums.length-1]) {
        return nums.length-1;
    }
    while(start<=end){
        
        mid=(start+end)/2;
        if(nums[mid]==target) return mid;
        if(nums[start]<= nums[mid]){
            if(target<=nums[mid]&&target>=nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }else{
             if(target<=nums[end]&&target>=nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
    }
    return -1;
    }
}