import java.util.Arrays;
import java.util.Scanner;

public class j2027 {
    

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t --> 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int []a = new int[n];
            
            for(int i = 0; i < n; i ++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            long res = 0;
            for(int i = 0; i < n; i++) {
                int left = i + 1, right = n - 1;
                int tmp = -1, smaller = a[i] + k;
                while(left <= right) {
                    int mid = (left + right) / 2;
                    if(a[mid] < smaller) {
                        tmp = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                if(tmp != -1) {
                    res += tmp - i;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
    
}
