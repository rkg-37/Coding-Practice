public class dutch_national_flag{

    public void dutch_national(int[] arr,int n){
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                //swap
                int t = arr[low];
                arr[low] = arr[mid];
                arr[mid] = t;
                // increment
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int t = arr[high];
                arr[high] = arr[mid];
                arr[mid] = t;
                high--;
            }
        }
        // System.out.println("mid  "+mid);
        // System.out.println("low  "+low);
        // System.out.println("high  "+high);
    }

    public static void main(String[] args){
        dutch_national_flag ms = new dutch_national_flag();
        // int[] arr = {1,0,2,1,0,1,0,1};
        int[] arr = {0,1,2,2,1,0};
        ms.dutch_national(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}