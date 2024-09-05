import java.util.Scanner;

public class j2004 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i ++) {
                arr[i] = sc.nextInt();
            }

            boolean flag = true;

            for(int i = 0; i < (int) n / 2; i ++) {
                if(arr[i] != arr[n - i - 1]) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
        sc.close();
    }

    
}