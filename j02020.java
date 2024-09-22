import java.util.Scanner;

public class j02020 {
    static int n, m;
    static boolean ok = false;

    static void init(int [] arr) {
        for(int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
    }

    static void next_combination(int [] arr) {
        int i = m - 1;
        while(i >= 0 && arr[i] == n - m + i + 1) {
            i--;
        }
        if(i >= 0) {
            arr[i]++;
            for(int j = i + 1; j < m; j++) {
                arr[j] = arr[j - 1] + 1;
            }
        }
        else {
            ok = true;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int [] arr = new int[m];
        init(arr);
        int cnt = 0;
        while(!ok) {
            for(int i = 0; i < m; i++) {
                System.out.print(arr[i]);
            }
            cnt ++;
            System.out.print(" ");
            next_combination(arr);
        }
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
        sc.close();
    }
}
