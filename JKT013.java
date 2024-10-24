import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class JKT013 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            Queue<String>q = new LinkedList<>();
            q.add("9");
            while(true){
                String m = q.peek();
                q.poll();
                if(Integer.parseInt(m) % n == 0 ){ 
                    System.out.println(m);
                    break;
                }
                q.add(m + "0");
                q.add(m + "9");
            }
        }
        sc.close();
    }
}
