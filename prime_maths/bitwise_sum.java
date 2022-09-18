
public class bitwise_sum{
    static int sum(int a , int b)
    {
        int carry = b,sum=0;
        while(carry!=0){
            sum = a^b;
            carry = (a&b)<<1;
            
            a =sum;
            b =carry;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(sum(4,5));
    }
}