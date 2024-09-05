public class j01021 {
    static int MOD = 1000000007;
    public static long luythua(int a, long b) {
        if(b == 0) return 1;
        if(b == 1) return a;
        long tmp = luythua(a, b / 2);
        if(b % 2 == 0) return (tmp * tmp) % MOD;
        else return (tmp * tmp % MOD) * a % MOD;
    }

    public static void main(String []args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        boolean fl = true;
        while(fl) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                fl = false;
                break;
            }
            else {
                System.out.println(luythua(a, b));
            }
        }
        sc.close();
    }
    
}
