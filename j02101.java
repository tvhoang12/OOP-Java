import java.util.Scanner;

public class j02101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            int [][] arr = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int k = 1;
            for(int i = 0; i < n; i++) {
                if (k > 0) {
                    int j = 0;
                    while(j < n) {
                        System.out.print(arr[i][j] + " ");
                        j ++;
                    }
                }
                else {
                    int j = n - 1;
                    while(j >= 0) {
                        System.out.print(arr[i][j] + " ");
                        j --;
                    }
                }
                k *= -1;
            }
            System.out.println();
        }
    }
}
