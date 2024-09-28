import java.util.Arrays;

public class j02016 {
    public static void main (String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long []a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                a[i] *= a[i];
            }

            Arrays.sort(a);
            boolean flag = false;

            for(int i = n - 1; i >= 2; i--) {
                int left = 0, right = i - 1;
                while(left < right) {
                    if(a[left] + a[right] == a[i]) {
                        flag = true;
                        break;
                    } else if(a[left] + a[right] < a[i]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
        sc.close(); 
    }
} 
