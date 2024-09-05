import java.util.Scanner;

public class j02106 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [][] a = new int[t][t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0; i < t; i++) {
            int count1 = 0;
            for(int j = 0; j < 3; j++) {
               if (a[i][j] == 1) {
                   count1 ++;
               } 
            }
            if (count1 > 2) {
                cnt ++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
