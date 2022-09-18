public class two_pass_algorithm{
    
    public void two_pass(int[] arr,int n){
        int c1=0,c0=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else
                c2++;
        }
    
        for(int k=0;k<c0;k++){
            arr[k]=0;
        }
        for(int k=c0;k<c0+c1;k++){
            arr[k]=1;
        }
        for(int k=c0+c1;k<c0+c1+c2;k++){
            arr[k]=2;
        }
    }

    public static void main(String[] args){
        two_pass_algorithm ms = new two_pass_algorithm();
        int[] arr = {1,0,2,1,0,1,0,1};
        int n=8;
        ms.two_pass(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}