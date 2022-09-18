import java.util.*;
public class gcd{
    public static int gcd_calculate(int a,int b){
        if(a%b == 0) return b;
        return gcd_calculate(b,a%b);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("result: "+gcd_calculate(a,b));
    }
}