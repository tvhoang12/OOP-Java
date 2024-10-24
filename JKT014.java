import java.util.Scanner;
import java.util.Stack;

public class JKT014 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    System.out.print(i + 1 + " ");
                }
                else {
                    System.out.print(i - st.peek() + " ");
                }
                
                st.push(i);
            }
            System.out.println();
        }
        sc.close();
    }
}