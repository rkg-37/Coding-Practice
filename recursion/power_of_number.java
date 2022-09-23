class power_of_number
{
    static long power(int N,int R)
    {
        //Your code here
        if (R == 0)
			return 1;

		long temp = power(N, R >> 1);
		long evenPower = (temp * temp) % 1000000007;

		if ((R&1) == 0)
			return evenPower;

		return (N * evenPower) % 1000000007;
    }
    static long power_itr(int N,int R)
    {
        //Your code here
        long m = 1000000007;
        long res=1;
        long val = N;
        while(R>0){
            if((R&1) == 1){
                res = ((res%m) *(val%m))%m;
            }
            R>>=1;
            val = ((val%m) *(val%m))%m;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(power(2,3));
        System.out.println(power_itr(2,3));
    }

}
