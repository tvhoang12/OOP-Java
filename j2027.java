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
            int ans = 0;
            for(int i = 0; i < n; i ++) {
                int lb = Arrays.binarySearch(a, a[i] + k);
                if(lb < 0) {
                    lb = -lb - 1;
                }
                else {
                    for(int j = lb; j < n; j ++) {
                        if(a[j] != a[i] + k) {
                            lb = j;
                            break;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
    
}
