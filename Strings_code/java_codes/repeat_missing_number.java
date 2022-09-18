import java.io.*;
import java.util.*;

public class repeat_missing_number{

    public static ArrayList<Integer> duplicate_finder(List<Integer> A){
        HashSet<Integer> map = new HashSet<>();
        int n = A.size(),min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,duplicate=-1,missing = -1;
        for(int i=0;i<n;i++){
            int a = A.get(i);
            max = (max < a)?a:max;
            min = (min > a)?a:min;
            if(!map.add(a)){
                duplicate =  a;
            }
        }
        
        int last  = min + (n-min);
        int start = last - n+1;
        for(int i=start;i<=last;i++){
            if(map.add(i)){
                missing = i;
                break;
            }
        }
        return new ArrayList<>(Arrays.asList(duplicate,missing));
    }

    public ArrayList<Integer> repeatedNumber(List<Integer> A) {
        HashSet<Integer> map = new HashSet<>();
        int n = A.size();
        return duplicate_finder(A);
        //System.out.println(duplicate_finder(A));
        // return new ArrayList<Integer>();
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> al = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            al.add(Integer.parseInt(br.readLine()));
        }
        repeat_missing_number rm = new repeat_missing_number();
        ArrayList<Integer> arr = rm.repeatedNumber(al);
         for (int i = 0; i < arr.size(); i++) 
            System.out.print(arr.get(i) + " ");

    }
}

// Example:

// Input:[3 1 2 5 3] 

// Output:[3, 4] 

// A = 3, B = 4