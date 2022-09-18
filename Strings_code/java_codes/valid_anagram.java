import java.io.*;
import java.util.*;
public class valid_anagram{

    // public boolean isAnagram(String s, String t) {
        
    //     HashMap<Character,Integer> arr = new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         char ch = Character.toLowerCase(s.charAt(i));
    //         if(arr.containsKey(ch)){
    //             Integer a = arr.get(ch);
    //             arr.put(ch,a.intValue()+1);
    //         }else{
    //             arr.put(ch,1);
    //         }
            
    //     }
        
    //     for(int i=0;i<t.length();i++){
    //         char ch = Character.toLowerCase(t.charAt(i));
    //         if(arr.containsKey(ch)){
    //             Integer a = arr.get(ch);
    //             if(a.intValue()-1 == 0 )
    //                 arr.remove(ch);
    //             else
    //                 arr.put(ch,a.intValue()-1);
    //         }else{
    //             return false;
    //         }
    //     }

    //     if(arr.isEmpty())   
    //         return true;
    //     else
    //         return false;
    // }


    public boolean matches(int[] ar1,int[] ar2){
        return Arrays.equals(ar1,ar2);
    }
    
    public boolean isAnagram(String s, String t) {
        int a = s.length(),b=t.length();
        if(a != b || a>b || b>a)
            return false;
        
        int[] char1 = new int[26];
        int[] char2 = new int[26];
        
        for(int i=0;i<t.length();i++){
            char ch1 = t.charAt(i);
            char1[ch1-'a']++;
            char ch2 = s.charAt(i);
            char2[ch2 -'a']++;
        }
        
        // return matches(char1,char2);
        return Arrays.equals(char1,char2);
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Enter string ");    
        String s=br.readLine(); 
        String t=br.readLine(); 
        valid_anagram va = new valid_anagram();
        boolean a = va.isAnagram(s,t);
        System.out.println(a);
    }
}