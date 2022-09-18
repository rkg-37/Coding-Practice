import java.io.*;
import java.util.*;
public class k_large_val{
    
    // public int findKthLargest(int[] nums, int k) {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     for(int i : nums)
    //         arr.add(i);
    //     Collections.sort(arr);
    //     return arr.get(arr.size()-k);
    // }

    // divide and conquer approach
    public static int divide_conquer(int[] nums,int k,int start,int end){
        if(start+1 ==  end)
            return 

    }


    public int findKthLargest(int[] nums, int k) {
        
    }


    public static void main(String[] args) throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Enter k ");    
        int k=Integer.parseInt(br.readLine());  
        int[] val = {3,2,1,5,6,4};
        k_large_val kl = new k_large_val();
        System.out.println(kl.findKthLargest(val,k));
    }
}