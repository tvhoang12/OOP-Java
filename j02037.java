import java.util.Scanner;

public class j02037 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int [] a = new int[arr.length];
            for(int i = 0; i < arr.length; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            int count = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i] % 2 == 1) {
                    count++;
                }
            }
            if(count > a.length - count && a.length % 2 == 1) {
                System.out.println("YES");
            }
            else if(count < a.length - count && a.length % 2 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
