import java.util.*;
public class swap_number{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        a = a^b^(b=a);
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}