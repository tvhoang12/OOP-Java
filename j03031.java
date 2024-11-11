import java.util.HashMap;
import java.util.Scanner;

public class j03031 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t --> 0) {
            String s = sc.next();
            int n = sc.nextInt();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < 26; i++) {
                map.put((char) ('a' + i), 0);
            }

            int len = s.length();
            char [] a = s.toCharArray();
            for(int i = 0; i < len; i++) {
                map.put(a[i], map.get(a[i]) + 1);
            }
            int count = 0;
            for(int i = 0; i < 26; i++) {
                if(map.get((char) ('a' + i)) == 0) {
                    count += 1;
                }
            }
            if(count <= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
