public class search_in_array_k{
    
    public static int search (int arr[], int n, int x, int k) {
       for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(i==0 && arr[i+1]-arr[i] <= k)
                    return i;
                if(i-1>=0 && i+1<=n-1 && arr[i+1]-arr[i] <= k && arr[i]-arr[i-1] <= k){
                    return i;
                }
                if(i==n-1 && arr[i]-arr[i-1] <= k){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {20,40,50,70,70,60};
        int k = 20;
        int x = 60;
        search_in_array_k ks = new search_in_array_k();
        System.out.println(ks.search(arr,arr.length,x,k));
    }

}