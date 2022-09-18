import java.util.*;
class next_permutation {

    public static void reverse(int[] nums,int i,int j){
        while(i < j) swap(nums, i++, j--);
    }

    public static void swap(int[] nums,int a,int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[i] > nums[j]) j--;
            swap(nums,i,j);
        }

        reverse(nums,i+1,n-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){
        int[] a = {1,4,6,7,9};
        int[] b = {1,4,6,9,7};
        int[] c = {1,4,7,9,6};
        int[] d = {1,6,4,7,9};
        // int[] b = {1,2,3};
        next_permutation np = new next_permutation();
        np.nextPermutation(a);
        np.nextPermutation(b);
        np.nextPermutation(c);
        np.nextPermutation(d);
        // np.next_permutation(b);
    }
}
