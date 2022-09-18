public class max_product_subarray{

    // public int maxProduct(int[] nums) {
    //       int n = nums.length;
    // int resp=Integer.MIN_VALUE,prodp=1,prodn=1;
    // for(int i=0;i<n;i++){
    //     prodp *= nums[i];
    //     prodn *= nums[i];
    //     if(prodp > resp)
    //             resp = prodp;
    //     if(prodn > resp)
    //             resp = prodn;
    //     if(prodp<=0)
    //         prodp=1;
        
    // }
    // return resp;
    // }

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int res=Integer.MIN_VALUE,prod=1;
        for(int i=0;i<n;i++){
            prod *= nums[i];
            if(prod > res)
                    res = prod;
            if(prodp<=0)
                prodp=1;
        }
        return resp;
    }

    public static void main(String[] args){
        max_product_subarray ms = new max_product_subarray();
        System.out.println(ms.maxProduct(new int[] {2,3,-2,4}));
        System.out.println(ms.maxProduct(new int[] {-2,0,-1}));
        System.out.println(ms.maxProduct(new int[] {-3,-1,-1}));
        
    }
}
