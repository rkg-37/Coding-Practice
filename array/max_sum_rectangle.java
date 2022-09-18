public class max_sum_rectangle
{
    public static int maxSumRectangle(int[][] arr, int n, int m)
    {
       
    }

    public static void main(String[] args){
        int[][] arr = {{1, 2 ,-1, -4, -20},{-8 ,-3,  4, 2, 1},{3,  8, 10, 1, 3},{-4, -1, 1 ,7 ,-6}};
        int n=4,m=5;
        max_sum_rectangle mr = new max_sum_rectangle();
        int a = mr.maxSumRectangle(arr,n,m);
        System.out.println(a);
    }
}