import java.util.*;
public class reverse_string{
    static String reverseString(String S){
        StringBuilder sbd  = new StringBuilder();
        int n = S.length();
        String[] st = S.trim().split("\\.");
        // System.out.println(Arrays.toString(st));
        int size = st.length;
        for(int i=size-1;i>0;i--){
            sbd.append(st[i]+".");
        }
        sbd.append(st[0]);
        return sbd.toString();
    }
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        String S = s.nextLine();
        System.out.println(reverseString(S));
    }
}