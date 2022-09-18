import java.util.*;
public class permutation_array{

    // public boolean isPossible(long a[], long b[], int n, long k) {
    //     HashMap<String,Integer> map = new HashMap<String,Integer>();
    //     for(int i=0;i<n;i++){
    //         String ss = String.valueOf(a[i]);
    //         if(map.containsKey(ss)){
    //             map.put(ss,map.get(ss)+1);   
    //         }else{
    //             map.put(ss,1);    
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         String ss = String.valueOf(k-b[i]);
    //         if(map.containsKey(ss)){
    //             map.put(ss,map.get(ss)-1);
    //             if(map.get(ss)<=0)
    //                 map.remove(ss);
    //         }else{
    //             break;
    //         }
    //     }
    //     if(map.isEmpty())
    //         return true;
    //     else
    //         return false;

    //     // System.out.println(map.toString());
    //     // return false;
    // }

    public boolean isPossible(long a[], long b[], int n, long k) {
        ArrayList<Long> arr1 = new ArrayList<>();
        ArrayList<Long> arr2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr1.add(a[i]);
            arr2.add(b[i]);
        }
        Collections.sort(arr1);
        Collections.sort(arr2,Collections.reverseOrder());
        for(int i=0;i<n;i++){
            if(arr1.get(i) + arr2.get(i)<k)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        long[] a = {1, 2, 3};
        long[] b = { 7, 8, 9};
        int n=3;
        long k=10;
        permutation_array pa = new permutation_array();
        System.out.println(pa.isPossible(a,b,n,k));
    }
}