import java.io.*;
import java.util.*;

public class Group_Anagrams{
   public static boolean anagram(String s, String t) {
    System.out.println("in  anagram");
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
        return Arrays.equals(char1,char2);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        System.out.println("in group anagram");
        int n =strs.length;

        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);

            if(map.containsKey(s)){
                ArrayList<String> val =map.get(s);
                val.add(strs[i]);
                map.put(s,val);
            }else{
                ArrayList<String> val = new ArrayList<>();
                val.add(strs[i]);
                map.put(s,val);
            }
        }    
        return new ArrayList(map.values());
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        //int n = Integer.parseInt(br.readLine());  
        String[] s = {"cat","tac","bat","tab"};
        System.out.println(Arrays.toString(s));
        Group_Anagrams va = new Group_Anagrams();
        List<List<String>>  a = va.groupAnagrams(s);
        for (int i = 0; i < a.size(); i++) 
            System.out.print(a.get(i) + " ");
    }

}


