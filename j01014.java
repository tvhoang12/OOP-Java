public class j01014 {
    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0) {
            long n = sc.nextLong();
            long maxPrime = 0;
            for(int i = 2; i < Math.sqrt(n); i ++) {
                if(n % i == 0) {
                    maxPrime = Math.max(i, maxPrime);
                    while(n % i == 0) {
                        n /= i;
                    }
                }
            }

            System.out.println(Math.max(maxPrime, n));
        }
        sc.close();
    }
}
