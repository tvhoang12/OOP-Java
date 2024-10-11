import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.Scanner;

public class bt2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            Set<Integer> odd = new TreeSet<>();
            Set<Integer> even = new TreeSet<>();
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(x % 2 == 0) {
                    even.add(x);
                } else {
                    odd.add(x);
                }
            }

            // Collections.sort(odd, Collections.reverseOrder());
            // Collections.sort(even);

            for(int i:even) {
                System.out.print(i + " ");
            }
            System.out.println();

            List<Integer> oddList = new ArrayList<>(odd);

            for(int i = oddList.size() - 1; i >= 0; i--) {
                System.out.print(oddList.get(i) + " ");
            }
            System.out.println();
        }
    }
    
}
