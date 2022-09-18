import java.io.*;
class valid_pallindrome {
    public boolean isPalindrome(String s) {
        
        int start = 0;
        int end = s.length()-1;
        
        while(start < end){
            if(Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))){
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                start++;
                end--;
            } else{
                if(!Character.isLetterOrDigit(s.charAt(start))){
                    start++;
                }
                if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                }
            }
        }    
        
        return true;

        
    }
    public static void main(String[] args) throws IOException{
        // String s = "hello olleh";
        // String s = "race a car";
        // BufferedReader = br = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Enter string ");    
        String s=br.readLine(); 
        valid_pallindrome vp = new valid_pallindrome();
        boolean a = vp.isPalindrome(s);
        System.out.println(a);
    }
}



/**
public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int n = s.length();
        int l= n-1; 
        
        StringBuilder st = new StringBuilder(50);
        for(int i=0;i<n;i++){
            if(Character.isAlphabetic(s.charAt(i)) ||  Character.isDigit(s.charAt(i)))
                st.append(s.charAt(i));
        }


        n = st.length();
        l= n-1; 

        for(int i=0;i<n/2;i++){
            if(st.charAt(i) == st.charAt(l)){
                l--;
                continue;
            }
            else
                return false;
        }

        return true;
    }
 */