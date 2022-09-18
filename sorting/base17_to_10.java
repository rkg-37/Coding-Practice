// sweet seventeen

import java.io.*;
public class base17_to_10{
    public static void main(String[] args){
        String s = "23GF";
        int ans = 0;
        int n = s.length()-1;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(Character.isDigit(a)){
                ans+=Character.getNumericValue(a)*Math.pow(17,n);
                n--;
            }else if(Character.isLetter(a)){
                int num = a - 'A'+10;
                ans+=Character.getNumericValue(a)*Math.pow(17,n);
                n--;
            }
        }
        System.out.println(ans);
    }
}