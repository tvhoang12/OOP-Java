import java.util.Scanner;
import java.util.Stack;

public class j02017 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        Stack<Integer> stack = new Stack<>();
        while(n --> 0) {
            x = sc.nextInt();
            if(!stack.empty() && (x + stack.peek()) % 2 == 0) {
                stack.pop();
            }
            else {
                stack.push(x);
            }
        }
        System.out.println(stack.size());
        sc.close();
    }
    
}
