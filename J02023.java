import java.util.Scanner;

public class J02023 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        int K2 = K;

        int [] biggest = new int[N];
        int [] smallest = new int[N];

        if(K == 0 || K > N * 9) {
            System.out.println("-1 -1 ");
        }
        else {
            K -= 1;
            for(int i = 0; i < N; i++) {
                if(K >= 9) {
                    biggest[i] = 9;
                    smallest[N - 1 - i] = 9;
                    K -= 9;
                    K2 -= 9;
                }
                else {
                    biggest[i] = K2;
                    smallest[N - 1 - i] += K;
                    K = 0;
                    K2 = 0;
                }
            }
            
            smallest[0] += 1;
            for(int i = 0; i < N; i++) {
                System.out.print(smallest[i]);
            }
            System.out.print(" ");
            for(int i = 0; i < N; i++) {
                System.out.print(biggest[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}
