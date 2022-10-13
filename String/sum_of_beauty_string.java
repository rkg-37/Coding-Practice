//{ Driver Code Starts
import java.io.*;
import java.util.*;

class sum_of_beauty_string {
    
    static int find_diff(ArrayList<Integer> arr){
        Collections.sort(arr);
        int ans = arr.get(arr.size()-1) - arr.get(0);
        System.out.println("diff :"+ans);
        return ans;
    }

    // naive solution
    static int beautySum_naive(String s) {
        // code here
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(map.containsKey(s.charAt(j))){
                    Integer a = map.get(s.charAt(j))+1;
                    map.put(s.charAt(j),a);
                }else{
                    map.put(s.charAt(j),1);
                }
                System.out.println(map);
                if(map.size() > 1){
                    ArrayList<Integer> a = new ArrayList<>(map.values());
                    sum+=find_diff(a);
                }
            }
            map.clear();
        }
        return sum;
    }



    // optimal solution
    static int beautySum(String s) {
        int a = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            int[] ar=new int[26];
            for(int j = i ; j < s.length() ; j++) {
                ar[s.charAt(j)-'a']++;
                
                int max = Integer.MIN_VALUE;
                 int min = Integer.MAX_VALUE;
                
                for(int k = 0 ; k < 26 ; k++){ 
                  max=Math.max(max,ar[k]);
                 if(ar[k]!=0) 
                    min=Math.min(min,ar[k]);
                 }
                a+=max-min;
               
            } 
           
        }
        return a;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s = br.readLine();
            
            
            // int res = beautySum_naive(s.trim());
            int res = beautySum(s.trim());
            
            System.out.println(res);
            
        }
    }
}

        
