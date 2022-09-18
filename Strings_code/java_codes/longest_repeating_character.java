import java.io.*;
import java.util.*;

public class longest_repeating_character{

    public int characterReplacement(String s, int k) {
        char prev='',curr='';
        int count=0,other=0;
        int n = s.length(),max=Integer.MIN_VALUE;
        prev = s.charAt(0);

        for(int i=1;i<n;i++){
            
        }

        // return 0;
    }


    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        longest_repeating_character lc = new longest_repeating_character();
        System.out.println(lc.characterReplacement(s,k));
    }
}