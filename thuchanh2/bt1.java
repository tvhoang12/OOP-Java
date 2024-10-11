import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            int maxi = -1, mini = 10;
            int n = s.length();
            for(int i= 0; i < n; i++) {
                if(maxi < s.charAt(i) - '0') {
                    maxi = s.charAt(i) - '0'; 
                }
                if (mini > s.charAt(i) - '0') {
                    mini = s.charAt(i) - '0';
                }
            }
            System.out.printf("%d %d\n", maxi, mini);
        }
        sc.close();
    }
}