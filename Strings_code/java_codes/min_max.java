import java.io.*;
import java.util.*;
class min_max
{ 
    public static int findSum(int[] A,int N) 
    {
    //    ArrayList<Integer> val = new ArrayList<Integer>();
    //    for(int i=0;i<N;i++){
    //         val.add(A[i]);
    //    }
    //    Collections.sort(val);
    //    return val.get(0)+val.get(N-1);
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]>max)
                max = A[i];
            if(A[i]<min)
                min = A[i];
        }
        return min+max;

       
    }

    public static void main(String[] args){
        min_max mm = new min_max();
        int[] a = {1,2,3,4,6,7,5};
        System.out.println(mm.findSum(a,7));
    }
}
