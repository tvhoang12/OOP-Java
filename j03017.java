import java.util.Scanner;

public class j03017 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); i++) {
                if(s.substring(i, i + 3).equals("100")) {
                    s = s.substring(0, i) + "" + s.substring(i + 3);
                    i --;
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}
