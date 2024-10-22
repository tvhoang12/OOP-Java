import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class j08015 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            List<Long> a = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }

            Collections.sort(a);

            int res = 0;

            for(int i = 0; i < n; i++) {
                if(Collections.binarySearch(a, k - a.get(i)) >= 0) {
                    if(a.get(Collections.binarySearch(a, k - a.get(i))) <= a.get(i)) {
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
    
}
