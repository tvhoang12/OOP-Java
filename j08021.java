import java.util.Scanner;
import java.util.Stack;

public class j08021 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int res = 0;
            for(int i = 0; i < s.length(); i ++) {
                if(s.charAt(i) == '(') {
                    st.push(i);
                }
                else {
                    if(st.size() > 1 && s.charAt(st.peek()) == '(') {
                        st.pop();
                        res = Math.max(res, i - st.peek());
                    }
                    else {
                        st.push(i);
                    }
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
    
}
