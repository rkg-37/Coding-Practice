import java.io.*;
import java.util.*;

public class common_elements{


    public static ArrayList<Integer> func(int[] A,int[] B,int n1,int n2){
        int i=0,j=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i<n1 && j<n2){
            if(A[i]==B[j]){
                if(!arr.contains(A[i]))
                    arr.add(A[i]);
                i++;
                j++;
            }
            else if(A[i]<B[j])
                i++;
            else
                j++;
        }
        return arr;
    }

    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> arr = func(A,B,n1,n2);
        int[] res = arr.stream().mapToInt(Integer::intValue).toArray();
        arr = func(res,C,res.length,n3);
        // for(Integer a : arr)
        //     System.out.print(a+" ");
        return arr;
    }

    public static void main(String[] args){
        int n1 = 6,n2 = 5,n3 = 8;
        int [] A = {1, 5, 10, 20, 40, 80};
        int [] B = {6, 7, 20, 80, 100};
        int [] C = {3, 4, 15, 20, 30, 70, 80, 120};
        common_elements ce = new common_elements();
        ArrayList<Integer> arr = ce.commonElements(A,B,C,n1,n2,n3);
        for(Integer a:arr)
            System.out.print(a+" ");
    }

}