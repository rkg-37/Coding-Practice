import java.lang.Math;
public class bitwise_calculate_square{
    static int square(int n)
    {
        
        // Base case
        if (n == 0)
            return 0;
 
        // Handle negative number
        // if (n < 0)
        //     n = -n;
        n = Math.abs(n);

        // Get floor(n/2) using
        // right shift
        int x = n >> 1;
 
        // If n is odd
        ;
        if (n % 2 != 0)
            return ((square(x) << 2) + (x << 2) + 1);
        else // If n is even
            return (square(x) << 2);
    }

    public static void main(String[] args){
        System.out.println(square(1569));
    }
}