import java.io.*;
import java.util.*;

class count_triplet_sum_x {
    
    public static long countTriplets(long a[], int n,int sum){
        Arrays.sort(a);
        long count = 0;
        for(int i=0; i<a.length-2; i++){
            int l=i+1, r=a.length-1;
            while (l<r) {
                if(a[i]+a[l]+a[r] < sum){
                    count += r-l;
                    l++;
                } else {
                    r--;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) throws IOException {
        int n = 5 , sum = 12;
        long[] arr ={5, 1, 3, 4, 7};
        int n1 = 18,sum1 = 86;
        long[] arr1 = {30 ,8, 23, 6, 10, 9 ,31, 7, 19, 20, 1, 33, 21, 27, 28, 3 ,25, 26};
        System.out.println(countTriplets(arr,n,sum));
        System.out.println(countTriplets(arr1,n1,sum1));
    }

}