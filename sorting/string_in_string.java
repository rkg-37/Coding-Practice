import java.io.*;

public class string_in_string{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String sk  = br.readLine();
        if( s.indexOf(sk) ==-1)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}