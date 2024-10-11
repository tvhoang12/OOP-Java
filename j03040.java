import java.util.Scanner;

public class j03040 {
    public static boolean isIncrease(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) >= s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEqual(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) != s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEqual3firstand2last(String s) {
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) {
            return true;
        }
        return false;
    }

    public static boolean is68(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) != '6' && s.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();

            s = s.substring(5, 8) + s.substring(9, 11);
            // System.out.println(s);
            if(isIncrease(s) || isEqual(s) || isEqual3firstand2last(s) || is68(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
