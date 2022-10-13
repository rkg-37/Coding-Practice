import java.util.*;
import java.io.*;

public class implement_atoi{
	
    public static int atoi(String str) {
		int n = str.length();
        for(int i=0;i<n;i++){
			if(!Character.isDigit(str.charAt(i)))
				return -1;
		}
		return Integer.parseInt(str.trim());
        
    }

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			System.out.println(atoi(str));
		    t--;
		}
	}
}
