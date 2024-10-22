import java.util.Scanner;
import java.util.Stack;

public class j08020 {
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in); 
       int t = sc.nextInt();
       sc.nextLine();
       while(t --> 0) {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for(char i : s.toCharArray()) {
                if(i == '(' || i == '[' || i == '{') {
                    st.push(i);
                } else {
                    if(i == ')' && !st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    }
                    else if(i == ']' && !st.isEmpty() && st.peek() == '[') {
                        st.pop();
                    }
                    else if(i == '}' && !st.isEmpty() && st.peek() == '{') {
                        st.pop();
                    }
                }
            }
            if(st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
           
       }
       
       
       sc.close();
    }
}