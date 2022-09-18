public class k_largest_element{

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
            }
        }
        arr[i+1] = arr[i+1] ^ arr[high] ^ (arr[high] = arr[i+1]);
        return i+1;
    } 
    public static int klarge(int[] nums,int low,int high,int k){
        int p = partition(nums,low,high);

        if(p > k)
            return klarge(nums,low,p-1,k);
        else if(p < k)
            return klarge(nums,p+1,high,k);
        else
            return nums[p];
    }


    public static  int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return  klarge(nums,0,n-1,n-k);
    }

    public static void main(String[] args){
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(arr,k));
    }
}



// 1ms second solution 

/**
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        partition(nums, 0, n-1, n-k);
        return nums[n-k];
    }
    
    private void partition(int[] nums, int l, int r, int k){
        int start = l;
        int end = r;
        int pivot = findPivot(nums, l, r);
        
        while (l <= r){
            while (l<=r && nums[l] < pivot){
                l++;
            }
            while (l<=r && nums[r] > pivot){
                r--;
            }
            if (l <= r){
                swap(nums, l, r);
                l++;
                r--;
            }
        }
    
        if (k <= r){
            partition(nums, start, r, k);
        }
        
        if (k >= l){
            partition(nums, l, end, k);
        }
        
        return;
    }
    
    private int findPivot(int[] arr, int l, int r){
        return arr[l+(r-l)/2];
    }
    
    private void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}

 */