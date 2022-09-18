//A Simple Solution is to generate all triplets and for every triplet check if it forms a triangle or not by checking above three conditions.

//An Efficient Solution is use sorting. First, we sort the array then we loop once and we will check three consecutive elements 
//of this array if any triplet satisfies arr[i] + arr[i+1] > arr[i+2], then we will output that triplet as our final result.


import java.util.*;

public class form_a_triangle{

	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
		if(arr==null)
            return false;
        
        Collections.sort(arr);

        for(int i=0;i<arr.size()-2;i++){
            
            int a = arr.get(i);
            int b = arr.get(i+1);
            int c = arr.get(i+2);

            if((a+b>c) && (a+c>b) && (b+c>a))
                return true;
            
        }
        return false;
	}
	

    public static void main(String[] args){
        ArrayList<Integer> arr  =  new ArrayList<>(Arrays.asList(6,10,6));
        form_a_triangle ft = new form_a_triangle();
        boolean b = ft.possibleToMakeTriangle(arr);
        System.out.println(b);
    }

}

// a + b > c
// a + c > b
// b + c > a


	// public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
	// 	if(arr==null)
    //         return false;
        
    //     int a = arr.get(0);
    //     int b = arr.get(1);
    //     int c = arr.get(2);

    //     for(int i=3;i<arr.size();i++){
    //         if((a+b>c) && (a+c>b) && (b+c>a))
    //             return true;
    //         else{
    //             a = b;
    //             b = c;
    //             c = arr.get(i);
    //         }
    //     }
    //     return false;
	// }

    // correct answer
    // public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
	// 	for(int i=0;i<arr.size();i++)
    //         for(int j=i+1;j<arr.size();j++)
    //             for(int k=j+1;k<arr.size();k++){
    //                 int a = arr.get(i);
    //                 int b = arr.get(j);
    //                 int c = arr.get(k);
                    
    //                 if(a+b>c && a+c>b && b+c>a){
    //                     return true;
    //                 }
    //             }

    //     return false;
	// }