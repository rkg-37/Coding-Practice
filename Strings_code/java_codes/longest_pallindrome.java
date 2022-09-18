import java.util.*;
import java.io.*;
public class longest_pallindrome{

    public static boolean pallindrome(String s){
        int n = s.length();
        int end = n -1;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(end))
                return false;
            end--;
        }
        return true;
    }

    // naive approach
    public static String naive_longestPalindrome(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                //System.out.println(s.substring(i,j+1));
                if(pallindrome(s.substring(i,j+1))){
                    int val = j+1-i;
                    if(max<val){
                        max = val;
                        ans = s.substring(i,j+1);
                    }
                }
                
            }
        }
        return ans;
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        int[] char1 = new int[26];
        Arrays.fill(char1,-1);
        int[] val = new int[n];
        String ans="";
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int pos = char1[ch-'a'];
            if(pos==-1){
                char1[ch-'a'] = i;
            }else{
                
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String s = "abcba";
        System.out.println(naive_longestPalindrome(s));
        System.out.println(longestPalindrome(s));
    }
}

































// naive approach

// public class longest_pallindrome{

//     public static boolean pallindrome(String s){
//         int n = s.length();
//         int end = n -1;
//         for(int i=0;i<n/2;i++){
//             if(s.charAt(i) != s.charAt(end))
//                 return false;
//             end--;
//         }
//         return true;
//     }

//     public static String longestPalindrome(String s) {
//         //System.out.println(pallindrome(s));
//         //return "";
//         int n = s.length();
//         int max = Integer.MIN_VALUE;
//         String ans="";
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 //System.out.println(s.substring(i,j+1));
//                 if(pallindrome(s.substring(i,j+1))){
//                     int val = j+1-i;
//                     if(max<val){
//                         max = val;
//                         //System.out.println("max "+max);
//                         ans = s.substring(i,j+1);
//                         //System.out.println("ans "+ans);
//                     }
//                 }
                
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args){
//         String s = "zzzzzzzzzzzzzzzzzzzzzzzzzz";
//         System.out.println(longestPalindrome(s));
//     }
// }

