import java.util.*;

public class count_sort{

    public static String countSort(String arr)
    {
        int[] order = new int[26];
        int n = arr.length();
        char[] output = new char[n];
        for(int i=0;i<n;i++){
            char ch = arr.charAt(i);
            order[ch-'a']++;
        }
        // System.out.println(Arrays.toString(order));

        for(int i=1;i<26;i++){
            order[i] = order[i]+order[i-1];
        }


        for(int i=0;i<n;i++){
            char ch = arr.charAt(i);
            output[order[ch-'a']-1] = ch;
        }
        // System.out.println(Arrays.toString(order));
        // System.out.println(Arrays.toString(output));
        return String.valueOf(output);
    }


    public static void main(String[] args){
        String s = "edsab";
        count_sort cs = new count_sort();
        System.out.println(cs.countSort(s));
    }
}