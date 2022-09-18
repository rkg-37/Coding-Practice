import java.util.*;
public class quicksort{

    
    public static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
            int p = partition_start(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    // taking last element as the pivot
    public static int partition_last(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                // swap
                //x = x ^ y ^ (y = x);
                arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
            }
        }
        arr[i+1] = arr[i+1] ^ arr[high] ^ (arr[high] = arr[i+1]);
        return i+1;
    } 
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition_start(int arr[], int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j)
        {
            while (i<=high && pivot >= arr[i])
                i++;
            while (j>=0 && pivot < arr[j])
                j--;
            if (i < j)
                swap(arr,i,j);
        }
        swap(arr,low, j);
        return j;
    }

    public static void main(String[] args){
        int[] arr = { 4, 1, 3, 9, 7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}