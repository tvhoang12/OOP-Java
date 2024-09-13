package thuchanh1;
import java.util.Scanner;

public class chuan_hoa_ho_ten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int methods = sc.nextInt();
            sc.nextLine();
            String[] ar = sc.nextLine().trim().split("\\s+");
            
            for (int i = 0; i < ar.length; i++) {
                ar[i] = ar[i].substring(0, 1).toUpperCase() 
                                + ar[i].substring(1).toLowerCase();
            }

            if(methods == 1) {
                System.out.print(ar[ar.length - 1] + " ");
                for(int i = 0; i < ar.length - 1; i++) {
                    System.out.print(ar[i] + " ");
                }
            }
            else {
                for(int i = 1; i < ar.length; i++) {
                    System.out.print(ar[i] + " ");
                }
                System.out.print(ar[0] + " ");
            }
            System.out.println();
        }
    }
}