import java.util.Scanner;

public class j03019 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char k = 'a';
        String res = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) - k >= 0) {
                res = s.charAt(i) + res;
                k = s.charAt(i);
            }
        }
        System.out.println(res);
        sc.close();
    }
}
