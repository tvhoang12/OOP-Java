public class j02035 {
    public static void main (String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long []a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean flag = false;
            int maxIndex = 0;
            for(int i = 1; i < n; i++) {
                if(a[i] < a[i - 1]) {
                    flag = true;
                    maxIndex = i;
                    break;
                }
            }
            if(flag) {
                System.out.println(maxIndex);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
