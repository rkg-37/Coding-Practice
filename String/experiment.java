import java.util.*;
import java.lang.*;
import java.io.*;

public class experiment{
    static void sort_list(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                Integer a = map.get(arr[i]);
                map.put(arr[i],a+1);
            }else{
                map.put(arr[i],1);
            }
        }

         // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());
 
        // Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
        //     public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
        //     {
        //         return (o2.getValue()).compareTo(o1.getValue());
        //     }
        // });

        // HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        // for (Map.Entry<Integer, Integer> aa : list) {
        //     temp.put(aa.getKey(), aa.getValue());
        // }

        // for(Map.Entry<Integer, Integer> en : temp.entrySet()) {
        //     // System.out.print(en.getKey()+" ");
        //     int v = en.getValue();
        //     int a = en.getKey();
        //     while(v > 0){
        //         System.out.print(a+" ");
        //         v--;
        //     }
        // }
        // for(Map.Entry<Integer,Integer> aa : list)
        //     System.out.println(aa);


    }
    
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-- > 0){
	        int n = s.nextInt();
	        int[] A = new int[n];
	        for(int i=0;i<n;i++){
	            A[i] = s.nextInt();
	        }
	        sort_list(A,n);
	    }
	 }
}