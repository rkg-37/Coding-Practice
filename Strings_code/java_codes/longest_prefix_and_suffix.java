import java.util.*;
import java.io.*;

public class longest_prefix_and_suffix{

    public static int naive_lps(String s) {
        int n = s.length(),max = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            String prefix = s.substring(0,i);
            String suffix = s.substring(n-i,n);
            if(prefix.compareTo(suffix) == 0){
                int val = i;
                if(val>max)
                    max = val;
            }
        }
        return max;
    }
    public static int lps(String s) {
        int n = s.length();
        int[] lps_val = new int[n];
        int len = 0;
        int i=1;
        while(i<n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps_val[i] = len;
                i++;
            }else{
                if(len==0){
                    lps_val[i] = len;
                    i++;
                }else{
                    len = lps_val[len-1];
                }
            }

        }
        System.out.println(Arrays.toString(lps_val));
        return lps_val[n-1];
    }
        public static int lps_itr(String s) {
        int n = s.length();
        int[] lps_val = new int[n];
        int len = 0;
        for(int i=1;i<n;i++){
            len = lps_val[i-1];
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps_val[i] = len;
            }else{
                if(len==0){
                    lps_val[i]=len;
                }
                else{
                    while(len>0 && s.charAt(i) != s.charAt(len)) len = lps_val[len-1];
                    if(len==0 && s.charAt(i) == s.charAt(len)){
                        lps_val[i] = len+1;
                        len++;
                    }
                    else if(len==0){
                        lps_val[i] = len+1;
                        len++;
                    }else{
                        len++;
                        lps_val[i] = len;
                    }
                        
                }
            }  
        }
        System.out.println(Arrays.toString(lps_val));
        return lps_val[n-1];
    }

    public static void main(String[] args){
        String s = "acccbaaacccbaac";
        System.out.println(naive_lps(s));
        System.out.println(lps(s));
        System.out.println(lps_itr(s));
    }
}



