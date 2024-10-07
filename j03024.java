import java.util.Scanner;

public class j03024 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String s = sc.next();
            int n = s.length();
            boolean invalid = false;
            int countOdd = 0;
            int countEven = 0;

            for(int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if(c < '0' || c > '9') {
                    invalid = true;
                    break;
                }
                if((c - '0') % 2 == 0) {
                    countEven++;
                }
                else {
                    countOdd++;
                }
            }

            if (invalid) {
                System.out.println("INVALID");
            }
            else {
                if(countEven > countOdd && s.length() % 2 == 0) {
                    System.out.println("YES");
                }
                else if(countOdd > countEven && s.length() % 2 == 1) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
