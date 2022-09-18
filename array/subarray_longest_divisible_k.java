import java.util.*;
import java.lang.*;
public class subarray_longest_divisible_k{      
    public static int solve(int n,int k,int[] m){
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=m[i];
            int r = sum%k;
            if(r<0)
                r = r+k;
            if(map.containsKey(r)){
                int pos = map.get(r);
                int len = i-pos;
                if(len>ans)
                    ans = len;
            }else{
                map.put(r,i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] m = new int[n];
        for(int i=0;i<n;i++){
            m[i] = s.nextInt();
        }
        int res = solve(n,k,m);
        System.out.println(res);
    }

}