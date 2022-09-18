import java.util.*;
import java.io.*;

public class duplicates_characters{

    public void duplicate_value(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                Integer a = map.get(ch);
                map.put(ch,a.intValue()+1);
            }else{
                map.put(ch,1);
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()+ " Value: " + e.getValue());

    }

    public static void main(String[] args) throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Enter string ");    
        String s=br.readLine();  
        duplicates_characters va = new duplicates_characters();
        va.duplicate_value(s);
    }
}