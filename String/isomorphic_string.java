import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class isomorphic_string {

    //Function to check if two strings are isomorphic.
    static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length() != str2.length()) return false;
        
        int n = str1.length();
        HashMap<Character,Character> kv = new HashMap<>();
        HashMap<Character,Boolean> v = new HashMap<>();
        for(int i=0;i<n;i++){
            if(kv.containsKey(str1.charAt(i))){
                if(kv.get(str1.charAt(i)) != str2.charAt(i))
                    return false;
            }else{
                if(v.containsKey(str2.charAt(i)))
                    return false;
                else{
                    kv.put(str1.charAt(i),str2.charAt(i));
                    v.put(str2.charAt(i),true);    
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            
            boolean a = areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends

// pijthbsfy
// fvladzpbf
class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length() != str2.length()) return false;
        
        int n = str1.length();
        HashMap<Character,Character> kv = new HashMap<>();
        HashMap<Character,Boolean> v = new HashMap<>();
        for(int i=0;i<n;i++){
            if(kv.containsKey(str1.charAt(i))){
                if(kv.get(str1.charAt(i)) != str2.charAt(i))
                    return false;
            }else{
                if(v.containsKey(str2.charAt(i)))
                    return false;
                else{
                    kv.put(str1.charAt(i),str2.charAt(i));
                    v.put(str2.charAt(i),true);    
                }
            }
        }
        
        return true;
        
    }
}