import java.io.*;
import java.util.*;

class Length_of_long_substring {
    public int lengthOfLongestSubstring(String s) {
      //   Map<Character, Integer> map = new HashMap<>();
      int[] char1 = new int[26];
      Arrays.fill(char1, -1);
        int m = 0,n = 0,x = 0;
        for(int i=0; i < s.length(); i++) {
          // Integer y = map.put(s.charAt(i), i);
          char ch = s.charAt(i);
          int y = char1[ch-'a'];
          char1[ch-'a']= i;
          if (y != -1 && y >= x) {
            x = y + 1;
            n = i - y;
          }
          else {
            n++;
            if (n > m) {
              m = n;
            }
          }
        }
      return m; 
    }
    
    public static void main(String[] args) throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Enter string ");    
        String s=br.readLine();  
        Length_of_long_substring va = new Length_of_long_substring();
        int a = va.lengthOfLongestSubstring(s);
        System.out.println(a);
    }
}

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.


// public int lengthOfLongestSubstring(String s) {
//         if(s.length()==0) return 0;
//         if(s.length()==1) return 1;
//         HashMap<Character,Integer> map = new HashMap<>();
//         int max_length=0;
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(map.containsKey(ch)){
//                 int len  = i - map.get(ch).intValue();
//                 max_length = (max_length < len )?len:max_length;
//                 map.put(ch,i);
//             }else{
//                 map.put(ch,i);
//             }
//         }
//         return max_length;
        
//     }
