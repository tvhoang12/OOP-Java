import java.util.Scanner;

public class j02014 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();

        while(t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int [] sum_to_index = new int [n];
            sum_to_index[0] = arr[0];
            for(int i = 1; i < n; i++) {
                sum_to_index[i] = sum_to_index[i - 1] + arr[i];
            }

            boolean check = false;

            for(int i = 1; i < n; i ++) {
                if(sum_to_index[i - 1] == sum_to_index[n - 1] - sum_to_index[i]) {
                    check = true;
                    System.out.println(i + 1);
                }
            }
            if(!check) {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
