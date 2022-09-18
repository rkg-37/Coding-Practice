import java.util.*;
class duplicate_value {

    // public int findDuplicate(int[] A) {
    //     int n = A.length;
    //     int[] arr = new int[n+1];
    //     for(int i=0;i<n;i++){
    //         System.out.println(Arrays.toString(arr));
    //         arr[A[i]]++;
    //         if(arr[A[i]] > 1)
    //             return A[i];
    //     }
    //     return -1;
    // }

    public int findDuplicate(int[] A) {

    }

    public static void main(String[] args){
         int[] a = {2,1,3,3,5,4};
        duplicate_value dv = new duplicate_value();
        System.out.println(dv.findDuplicate(a));
    }
}


// new approach
// Using Hare and tortoise method.
// Here we’ll be using 2 pointers fast and slow. Initially slow will initialize with the first element and fast will initialize with the element present in nums[0] index.
// In the first loop, we’ll move both pointers with 1 index & break after slow=fast.
// Then we’ll make fast 0 & in the next loop we’ll move the slow pointer with 1 position and fast with 2 positions.
// One point the both will equal and return fast/slow.
// Time complexity: O(n).