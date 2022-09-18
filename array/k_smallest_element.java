public class k_smallest_element{

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                arr[i]=arr[i]^arr[j]^(arr[j]=arr[i]);
            }
        }
        arr[i+1]=arr[i+1]^arr[high]^(arr[high]=arr[i+1]);
        return i+1;
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int p = partition(arr,l,r);
        //System.out.println(p);
        if(p > k)
            return kthSmallest(arr,l,p-1,k);
        else if(p < k)
            return kthSmallest(arr,p+1,r,k);
        else    
            return arr[k];
    } 

    public static void main(String[] args){
        int N = 6;
        int[] arr = {7 ,10, 4, 3 ,20 ,15};
        int K = 3;
        System.out.println(kthSmallest(arr,0,N-1,K-1));
    }
}