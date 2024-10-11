import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        if(s.length() % 2 == 1) {
            n -= 1;
        }
        Set<Integer> num = new TreeSet<>();
        for(int i = 0; i < n; i += 2) {
            String temp = s.substring(i, i + 2);
            num.add(Integer.parseInt(temp));
        }
        for(int i: num) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
