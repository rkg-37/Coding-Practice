import java.io.*;
import java.util.*;
/**
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
 */
class roman_to_integer {

    // Finds decimal value of a given roman numeral
    public static int romanToDecimal(String str) {

        // Initializing a Dictionary
        Hashtable<Character,Integer> kv = new Hashtable<>();
        kv.put('I', 1); 
        kv.put('V', 5); 
        kv.put('X', 10); 
        kv.put('L', 50); 
        kv.put('C', 100); 
        kv.put('D', 500); 
        kv.put('M', 1000); 

        int n = str.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(i>0 && kv.get(ch) > kv.get(str.charAt(i-1))){
                sum-=2*kv.get(str.charAt(i-1));
            }
            sum+=kv.get(ch);
        }
    
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            System.out.println(romanToDecimal(roman));
        }
    }
}