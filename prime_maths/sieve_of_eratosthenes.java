import java.util.*;

public class sieve_of_eratosthenes{
    public static boolean[] isPrime(int n){
        boolean[] b = new boolean[n+1];
        Arrays.fill(b,true);
        b[0] = b[1] = false;
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n;j+=i){
                b[j] = false;
            }
        }
        return b;
    }
    

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter till where you want to check the prime number ");
        int n = s.nextInt();
        boolean[] b = isPrime(n);
        for(int i=0;i<n+1;i++){
            if(b[i] == true)
                System.out.print(i+" ");
        }
        // System.out.println(Arrays.toString(b));
    }
}