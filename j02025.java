import java.util.Arrays;
import java.util.ArrayList;

public class j02025 {
    static boolean ok = false;
    public static void binary(int a[]) {
        int i = a.length - 1;
        while(i >= 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if(i >= 0) {
            a[i] = 1;
        }
        else {
            ok = true;
        }
    }
    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            int []b = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = 0;
            }

            Arrays.sort(a);
            ArrayList<Integer> c = new ArrayList<>();
            for(int i = n - 1; i >= 0; i--) {
                c.add(a[i]);
            }
            
            ok = false;
            while (!ok) {
                int sum = 0;
                for(int i = 0; i < n; i++) {
                    sum += c.get(i) * b[i];
                }

                if(isPrime(sum)) {
                    for(int i = 0; i < n; i++) {
                        if(b[i] == 1) {
                            System.out.print(c.get(i) + " " );
                        }
                    }
                    System.out.println();
                }
                binary(b);
            }
        }
        sc.close();
    }
}
