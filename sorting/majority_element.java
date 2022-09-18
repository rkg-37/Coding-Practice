public class majority_element{
     public static int majorityElement(int[] nums) {
        int count=0,res=0;
           for(int i=0;i<nums.length;i++){
            if(count == 0){
                res = nums[i];
                count++;
            }
            else{
                if(nums[i] != res)
                    count--;
                else
                    count++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = {2,2,2,1,1,1,2,2};
        System.out.println(majorityElement(a));
    }
}