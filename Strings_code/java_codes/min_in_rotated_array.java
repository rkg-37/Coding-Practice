public class min_in_rotated_array{

    // public int findMin(int[] nums) {
    //      int n = nums.length,i=0;
    //     while(i<=n-2){
    //         if(nums[i] > nums[i+1]) return nums[i+1];
    //         i++;
    //     }
    //     return nums[0];
    // }

    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(start < mid && nums[mid] < nums[mid-1])
                return  nums[mid];
            
            if(end > mid && nums[mid] > nums[mid+1])
                return  nums[mid+1];

            if(nums[start] >= nums[mid])
                start = mid+1;
            else
                end = mid-1;

        }
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        return nums[nums.length-1];
        // return 0;
    }

    public static void main(String[] args){
        int[] a = {4,5,6,7,0,1,2,3};
        min_in_rotated_array ma = new min_in_rotated_array();
        System.out.println(ma.findMin(a));
    }

}