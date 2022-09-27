import java.util.*;

public class maximun_area_histogram{
    public static int solve_mah(int[] arr,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            int min = arr[i];
            for(int j=i;j<n;i++){
                
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(solve_mah(arr,n)));
    }
}