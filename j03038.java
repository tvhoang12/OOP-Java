
import java.util.*;


public class j03038 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i ++) {
            for(int j = i; j < s.length(); j ++) {
                set.add(s.charAt(i));
            }
        }
        System.out.println(set.size());
        sc.close();
    }
    
}
