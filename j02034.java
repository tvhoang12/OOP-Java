import java.util.Scanner;

public class j02034 {
    public static void main(String [] args) {
        // This is a template for Java code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxValue = a[n - 1];
        boolean isIncreasing = false;
        for(int i = 1, j = 0; i <= maxValue; i ++) {
            if(j < n && a[j] == i) {
                j ++;
            }
            else {
                System.out.println(i);
                isIncreasing = true;
            }
        }
        if(!isIncreasing) {
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
