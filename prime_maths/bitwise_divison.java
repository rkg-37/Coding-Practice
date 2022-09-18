public class bitwise_divison{
    public static long divide(long a,long b){
        long sign=1;
        if(a<0 && b>0 || a>0 && b<0){
            sign=-1;
        }
        
        a = Math.abs(a);
        b = Math.abs(b);

        long q=0,t=0;

        for(int i=31;i>=0;i--){
            if(t+(b<<i) <= a){
                t += b<<i;
                q += 1L<<i;
            }
        }
        return sign*q;
    }

    public static void main(String[] args){
        System.out.println(divide(43,-8));
    }
}