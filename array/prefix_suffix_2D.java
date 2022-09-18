// 2 D array

import java.util.*;
public class prefix_suffix_2D{

    public static void array_2d(int[][] arr,int r,int c){
       for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void prefix_sum(int[][] arr,int r,int c){
       int[][] prefix = new int[r][c];

       for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                prefix[i][j] = arr[i][j]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
                // System.out.println(prefix[i][j]);
            }
       }
        array_2d(prefix,r,c);
    }


    public static void suffix_sum(int[] arr,int r,int c){
        
    }

    public static void main(String[] args){
        int[][] arr = {{0,0,0,0,0,0},{0,1,3,5,7,9},{0,1,2,3,4,5},{0,2,4,6,8,10}};
        prefix_sum(arr,4,6);
        // suffix_sum(arr,4,6);
    }

}