package thuchanh1;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class tap_hop_so_nguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        Set<Integer> res = new TreeSet<>(a);
        res.retainAll(b);
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();

        Set<Integer> c = new TreeSet<>(a);
        c.removeAll(b);
        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        Set<Integer> d = new TreeSet<>(b);
        d.removeAll(a);
        for (int i : d) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
