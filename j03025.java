import java.util.Scanner;

public class j03025 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            int left = 0, right = s.length() - 1;
            int countDifferent = 0;

            while(left < right) {
                if(s.charAt(left) != s.charAt(right)) {
                    countDifferent++;
                }
                left++;
                right--;
            }

            if(countDifferent == 1) {
                System.out.println("YES");
            }
            else {
                if(countDifferent == 0 && s.length() % 2 == 1) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }    
            }
        }
        sc.close();
    }
}
