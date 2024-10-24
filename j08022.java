import java.util.Scanner;
import java.util.Stack;

public class j08022 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Stack<Integer> stack = new Stack<>();
            int [] res = new int[n];
            for(int i = n - 1; i >= 0; i--) {
                while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
            for(int i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close(); 
    }
}
