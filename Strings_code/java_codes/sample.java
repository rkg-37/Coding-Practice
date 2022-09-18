import java.io.*;
import java.util.*;

public class sample{
    public static void main(String[] args){
        // Stack<Integer> s = new Stack<Integer>();
        // s.push(22);
        // System.out.println((Integer)s.pop()+1);
        StringBuilder st = new StringBuilder(5);
        st.setCharAt(2, 'L');
        st.setCharAt(3, 'a');
        st.setCharAt(1, 'b');
        st.setCharAt(0, 'c');
        System.out.println(st.toString());
        System.out.println(st.capacity());
    }
}
