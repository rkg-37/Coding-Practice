import java.util.*;
public class longest_substring_norepeat{
    
    static int longestUniqueSubsttr(String S){
        Queue<Character> q = new LinkedList<>();
        int n = S.length();
        int max=0;
        for(int i=0;i<n;i++){
            char ch = S.charAt(i);
            if(q.contains(ch)){
                while(q.contains(ch)){
                    q.poll();
                }
            q.add(ch);
            }else{
                q.add(ch);
                if(q.size() > max)
                    max = q.size();
            }
        }
        return max;
    }

    static int longestUniqueSubsttr_optimal(String S){
        HashMap<Character,Integer> map = new HashMap<>();
        int n = S.length();
        int max=Integer.MIN_VALUE;
        int l=0,r=0;
        while(r<n){
            char ch = S.charAt(r);
            if(map.containsKey(ch)){
                l = Math.max(map.get(ch)+1,l);
            }
            map.put(ch,r);
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        System.out.println(longestUniqueSubsttr(st));
        System.out.println("most optimal approach :"+longestUniqueSubsttr_optimal(st));
    }
}