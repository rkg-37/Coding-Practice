import java.util.*;
import java.lang.*;

class good_number {
    static int value(int x,int D){
        if(x<10 && x!=D)
            return x;
        int c = x;
        int sum=0;
        int j=0;
        while(c>0){
            int d = c%10;
            if(d==D)
                return -1;
            if(j==0){
                sum=d;
                j=1;
                c/=10;
                continue;
            }
            if(sum>=d || d == D)
                return -1;
            sum+=d;
            c/=10;
            if(c==0)
                return x;
        }
        return x;
    }
    
    static ArrayList<Integer> goodNumbers(int L, int R, int D) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=L;i<=R;i++){
            if(value(i,D) != -1)
                arr.add(i);
        }
        return arr;
    }
    public static void main(String[] args){
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int R = s.nextInt();
        int D = s.nextInt();
        System.out.println(goodNumbers(L,R,D));
    }
}