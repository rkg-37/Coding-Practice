public class sum_rotated_sorted_Array{
    
    public static boolean sum_rotated(int[] arr,int x){
        int n = arr.length;
        int k=0, pos=-1;
        while(k<n-1){
            if(arr[k]>arr[k+1]){
                pos=k;
                break;
            }
            k++;
        }
        pos++;
        int l = pos,r = pos-1;
        while(l!=r){
            System.out.println("arr[l] "+arr[l]+" arr[r] " + arr[r]);
            int val = arr[l]+arr[r];
            if(val == x)
                return true;
            else if(val > x){
                r = (n+r-1)%n;
            }else{
                l = (l+1)%n;
            }
        }
        return false; 
    }

    public static void main(String[] args){
        int[] arr = {11, 15, 6, 8, 9, 10};
        int  X = 16;
        System.out.println(sum_rotated(arr,X));
    }
}