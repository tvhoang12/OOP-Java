import java.util.Scanner;
import java.util.TreeSet;

public class j02005 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int i = 0; i < n; i ++) {
            set1.add(sc.nextInt());
        }
        for(int i = 0; i < m; i ++) {
            set2.add(sc.nextInt());
        }
        set1.addAll(set2);
        for(int x : set1) {
            System.out.print(x + " ");
        }
        sc.close();
        
    }
    
}
