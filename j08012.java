import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class j08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] countDup = new int[n];

        for(int i : countDup) countDup[i] = 0;

        for(int i = 0; i < n - 1; i++) {
            int m = sc.nextInt();
            int k = sc.nextInt();

            countDup[m - 1] += 1;
            countDup[k - 1] += 1;
        }
        
        for(int i = 0; i < countDup.length; i++) {
            if(countDup[i] != 1) {
                if(countDup[i] == n - 1) {
                    System.out.println("Yes");
                    break;
                }
                else if(countDup[i] > 1 && countDup[i] < n - 1) {
                    System.out.println("No");
                    break;
                }
            }
        }

    }
}