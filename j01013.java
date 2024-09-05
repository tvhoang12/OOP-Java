public class j01013 {
    static int arr[] = new int[2000001];

    static void sieve() {
        for(int i = 0; i < 2000001; i ++) {
            arr[i] = 0;
        }

        for(int i = 2; i <= Math.sqrt(2000001); i ++) {
            if(arr[i] == 0) {
                for(int j = i * i; j < 2000001; j += i) {
                    if(arr[j] == 0) {
                        arr[j] = i;
                    }
                }
            }
        }

        for(int i = 1; i < 2000001; i ++) {
            if (arr[i] == 0) {
                arr[i] = i;
            }
        }
    }

    public static void main(String [] args) {
        sieve();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;

        while(t --> 0) {
            int n = sc.nextInt();
            while(n != 1 && arr[n] != 0) {
                sum += arr[n];
                n /= arr[n];
            }
        }
        
        System.out.println(sum);
        sc.close();
    }
}
