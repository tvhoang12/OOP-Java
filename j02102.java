import java.util.Arrays;

public class j02102 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * n];
        int[][] b = new int[n][n];

        // Read the inputs into the array
        for (int i = 0; i < n * n; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);

        // Initialize boundaries
        int h1 = 0, h2 = n - 1, v1 = 0, v2 = n - 1;
        int i = 0;

        // Fill the matrix in a spiral order
        while (h1 <= h2 && v1 <= v2) {
            // Fill top row
            for (int j = h1; j <= h2; j++) {
                b[v1][j] = a[i++];
            }
            v1++; // Move down the top boundary

            // Fill right column
            for (int j = v1; j <= v2; j++) {
                b[j][h2] = a[i++];
            }
            h2--; // Move left the right boundary

            // Fill bottom row
            if (v1 <= v2) { // Check if there is a row to fill
                for (int j = h2; j >= h1; j--) {
                    b[v2][j] = a[i++];
                }
                v2--; // Move up the bottom boundary
            }

            // Fill left column
            if (h1 <= h2) { // Check if there is a column to fill
                for (int j = v2; j >= v1; j--) {
                    b[j][h1] = a[i++];
                }
                h1++; // Move right the left boundary
            }
        }

        // Print the resulting matrix
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(b[j][k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
