import java.io.*;
import java.util.*;

public class overlap_interval{
    public static int[][] overlappedInterval(int[][] arr){
        List<List<Integer>> val = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            val.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{arr[i][0],arr[i][1]})));
        }
        //System.out.println(val);
        Collections.sort(val, new Comparator<List<Integer>>() {
            public int compare(List<Integer> p1, List<Integer> p2) {
                return p1.get(0) - p2.get(0);
            }
        });
        //System.out.println(val);

        Stack<List<Integer>> s = new Stack<>();

        s.push(val.get(0));

        for(int i=1;i<arr.length;i++){
            List<Integer> curr = val.get(i);
            List<Integer> top = s.peek();
            if(top.get(1) < curr.get(0)){
                s.push(curr);
            }else if(top.get(1) < curr.get(1)){
                top.set(1, curr.get(1));
                s.pop(); 
                s.push(top);
            }
        }

        int[][] ans  = new int[s.size()][2];
        int l=s.size()-1;
        while(!s.isEmpty()){
            List<Integer> t = s.pop(); 
            ans[l][0] = t.get(0);
            ans[l][1] = t.get(1);
            l--;
        }
        return ans;
    }

    public static void main(String[] args){
        int[][] Intervals = {{1,3},{9,10},{2,4},{6,8}};
        int[][] ans = overlappedInterval(Intervals);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }
    }
}

/**

public int[][] overlappedInterval(int[][] intervals)
   {
       List<int[]> l1=new ArrayList<>();
       if(intervals.length==0 || intervals==null){
           return l1.toArray(new int[0][]);
       }
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int start=intervals[0][0];
       int end=intervals[0][1];
       for(int[] i:intervals){
           if(i[0]<=end){
               end=Math.max(end,i[1]);
           }
           else{
               l1.add(new int[]{start,end});
               start=i[0];
               end=i[1];
           }
       }
       l1.add(new int[]{start,end});
       return l1.toArray(new int[0][]);
   }
   
 */