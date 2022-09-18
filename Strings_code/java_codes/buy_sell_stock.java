import java.io.*;
import java.util.*;

class buy_sell_stock {
    public int maxProfit(int[] prices) {
        if(prices==null) return 0;
        int i=0,j=1;
        int maxprofit = 0;
        while(i<j && j<prices.length){
            if(prices[i]>prices[j]){
                i=j;
                j++;
            }
            else{
                int diff = prices[j] - prices[i];
                if(diff>maxprofit)
                    maxprofit = diff;
                j++;
            }
        }

        return maxprofit;
    }

    public static void main(String[] args){
        int[] a = {7,1,5,3,6,4};
        int[] b = {7,6,4,3,1};
        buy_sell_stock bs = new buy_sell_stock();
        System.out.println(bs.maxProfit(a));
        System.out.println(bs.maxProfit(b));
    }
}