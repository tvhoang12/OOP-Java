import java.util.Scanner;

public class j02103 {
    public static int [][] multiply(int [][] arrA, int [][] arrB) {
        int n = arrA.length, m = arrB[0].length;
        int [][] res = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for(int k = 0; k < arrB.length; k++) {
                    res[i][j] += arrA[i][k] * arrB[k][j];
                }
            }
        }
        return res;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 1; test <= t; test++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int [][] arrA = new int[n][m];
            int [][] arrB = new int[m][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    arrB[j][i] = arrA[i][j] = sc.nextInt();
                }
            }

            int [][] res = multiply(arrA, arrB);
            System.out.println("Test " + test + ":");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
