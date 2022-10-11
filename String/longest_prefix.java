import java.io.*;
import java.util.*;

class longest_prefix
{
    static String longestCommonPrefix(String arr[], int n){
        // code here
        int pos = 0;
        for(int i=0;i<n;i++){
            if(arr[i].length() < arr[pos].length())
                pos=i;
        }
        
        String prefix = arr[pos];
        int j = prefix.length();
        
        for(int i=0;i<n;i++){
            while(j>0 && !prefix.equals(arr[i].substring(0,j))){
                j--;
                prefix = prefix.substring(0,j);
            }
        }
        if(j<=0)
            return "-1";
        return prefix;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            System.out.println(longestCommonPrefix(arr, n));
        }
    }

}

/**

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings

 */