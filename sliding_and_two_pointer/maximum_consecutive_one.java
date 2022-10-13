import java.io.*;
import java.util.*;

class maximum_consecutive_one {
    
    // public static int longestOnes(int n, int[] nums, int k) {
    //     // code here
    //     Queue<Integer> queue = new LinkedList<>();
    //     int kc = k;
    //     int max=0;
    //     for(int i=0;i<n;i++){
    //         if(nums[i] == 1){
    //             queue.add(nums[i]);
    //         }else if(k>0 && nums[i] == 0){
    //             queue.add(nums[i]);
    //             k--;
    //         }else if(k==0 && nums[i]==0){
    //             max = (max<queue.size())?queue.size():max;
    //             int p = -1;
    //             while(p!=0){
    //                 p = queue.peek();
    //                 queue.poll();
    //             }
    //             k++;
    //             queue.add(nums[i]);
    //             max = (max<queue.size())?queue.size():max;
    //         }
    //     }
    //     return max;
    // }

    public static int longestOnes(int n, int[] nums, int k) {
        int i=0,j=-1;
        int count=0,ans=0;
        while(i<n){
            if(nums[i]==0){
                count++;
            }
            while(count>k){
                j++;
                if(nums[j] == 0)
                    count--;
            }
            int len = i-j;
            if(ans < len)
                ans=len;
            i++;
        }
        return ans;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = input(br, n);
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            
            int res = longestOnes(n, nums, k);
            
            System.out.println(res);
            
        }
    }
}
