import java.util.*;
public class infix_postfix{

    static int prec(char ch){
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }

    public static void postfix_expression(String st){
        int n = st.length();
        Stack<Character> s = new Stack<>();
        String result="";
        for(int i=0;i<n;i++){
            char ch = st.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')
                    result+=ch;
            else if (ch == '(')
                s.push('(');
            else if (ch == ')') {
                while (s.peek() != '('){
                    result += s.peek();
                    s.pop();
                }
                s.pop();
            }else{ 
                while (!s.isEmpty() && prec(ch) <= prec(s.peek())) { 
                    result += s.peek();
                    s.pop();
                }
                s.push(ch);
            }
        }

        while (!s.isEmpty()) {
            result += s.peek();
            s.pop();
        }
        System.out.println(result);
        
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        postfix_expression(st);
    }
}