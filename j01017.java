import java.util.*;

public class j01017 {
    public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            boolean check = true;
            for (int i = 0; i < s.length() - 1; i++) {
                if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1)
                {
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");

        }
        sc.close();
    }
    
}
