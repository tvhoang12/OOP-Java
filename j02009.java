import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class j02009 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        
        Vector<int[]> Time = new Vector<int[]>();
        for(int i = 0; i < n; i++) {
            int []a = new int[2];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            Time.add(a);
        }

        Collections.sort(Time, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                // So sánh phần tử cột 0, nếu bằng thì so sánh cột 1
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                } else {
                    return Integer.compare(a[1], b[1]);
                }
            }
        });

        int resTime = 0;
        for(int[] a : Time) {
            resTime = Math.max(resTime, a[0]);
            resTime += a[1];
        }
        System.out.println(resTime);
    }
}
