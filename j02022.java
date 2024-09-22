import java.util.Scanner;

public class j02022 {
    static int n;
    static boolean ok = false;

    static void init(int [] arr) {
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
    }

    static void swap(int [] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void next_permutation(int [] arr) {
        int i = n - 1;
        while (i > 0 && arr[i] < arr[i - 1]) {
            i --;
        }
        if(i == 0) {
            ok = true;
        }
        else {
            int k = n - 1;
            while(arr[k] < arr[i - 1]) {
                k --;
            }
            swap(arr, k, i - 1);
            int l = i;
            int r = n - 1;
            while(l < r) {
                swap(arr, l, r);
                l ++;
                r --;
            }
        }
    }

    static boolean check(int [] arr) {
        for(int i = 0; i < n - 1; i++) {
            if(Math.abs(arr[i] - arr[i + 1]) <= 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            n = sc.nextInt();
            int [] arr = new int[n];
            ok = false;
            init(arr);

            while(!ok) {
                
                if(check(arr)) {
                    for(int i = 0; i < n; i++) {
                        System.out.print(arr[i]);
                    }
                    System.out.println();
                }
                next_permutation(arr);
            }
        }

        sc.close();
    }
}
