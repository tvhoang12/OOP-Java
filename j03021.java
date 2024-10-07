import java.util.Scanner;

public class j03021 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String s = sc.next();
            s = s.toLowerCase();
            String res = "";
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                switch (c) {
                    case 'a':
                    case 'b':
                    case 'c':
                    case '2':
                        res+="2";
                        break;
                    case 'd':
                    case 'e':
                    case 'f':
                    case '3':
                        res+="3";
                        break;
                    case 'g':
                    case 'h':
                    case 'i':
                    case '4':
                        res+="4";
                        break;
                    case 'j':
                    case 'k':
                    case 'l':
                    case '5':
                        res+="5";
                        break;
                    case 'm':
                    case 'n':
                    case 'o':
                    case '6':
                        res+="6";
                        break;
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case '7':
                        res+="7";
                        break;
                    case 't':
                    case 'u':
                    case 'v':
                    case '8':
                        res+="8";
                        break;
                    default:
                        res+="9";
                        break;
                }
                
            }
            if (res.equals(new StringBuilder(res).reverse().toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
