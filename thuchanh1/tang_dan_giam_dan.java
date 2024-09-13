package thuchanh1;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;

public class tang_dan_giam_dan {
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // So sánh ngược để sắp xếp giảm dần
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0) {
            int n = sc.nextInt();
            int k;
            
            Set<Integer> even = new TreeSet<>();
            Set<Integer> odd = new TreeSet<>(Collections.reverseOrder());

            for(int i = 0; i < n; i++) {
                k = sc.nextInt();
                if(k % 2 == 0) {
                    even.add(k);
                }
                else {
                    odd.add(k);
                }
            }

            for(int i : even) {
                System.out.print(i + " ");
            }
            System.out.println();

            for(int i : odd) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
