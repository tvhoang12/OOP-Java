import java.util.Scanner;
public class j01012 {
    public static boolean []sieve(boolean []arr) {
        arr[0] = arr[1] = false;
        for(int i = 2; i <= 1000000000; i ++) {
            if(arr[i]) {
                for(int j = i * i; j <= 1000000000; j += i) {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }
    public static void main(String [] args) {
        boolean[] arr = new boolean[1000000001];
        Scanner sc = new Scanner(System.in);
        sieve(arr);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int countNumberDevide2 = 0;
            while(n % 2 == 0) {
                n /= 2;
                countNumberDevide2 ++;
            }
            if(countNumberDevide2 == 0) {
                System.out.println(countNumberDevide2);
            }
            else {
                int count = 0;
                int z = 3;
                while(n > 1) {
                    if(n % z == 0 && arr[z]) {
                        while(n % t == 0) {
                            count ++;
                            n /= t;
                        }
                        countNumberDevide2 *= (count + 1);
                        count = 0;
                    }
                    z += 2;
                }
                System.out.println(countNumberDevide2);
            }
        }
        sc.close();
    }
}