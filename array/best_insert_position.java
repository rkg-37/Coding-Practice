
public class best_insert_position{
    
    public static int bestInsertPos(int [] arr, int n, int m){
        if(arr[0]>m) return 0;
        if(arr[arr.length-1]<m) return arr.length;

        int start=0,end=n-1;
        while(end>=start){
            int mid = (start+end)/2;
            if(arr[mid]==m){
                return mid;
            }else if(arr[mid]<m){
                start=mid+1;
                
            }else{
                end=mid-1;
            }
        }
        return end+1;
	}


    public static void main(String[] args){
        int[] arr = {1,2,4,7};
        int n = 4;
        int m = 6;
        best_insert_position bp = new best_insert_position();
        int a =bp.bestInsertPos(arr,n,m);
        System.out.println(a);

    }

}

