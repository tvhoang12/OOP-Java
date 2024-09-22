import java.util.Scanner;

public class j03035 {
    public static long findingCase(String a, String b) {
        int n = a.length();
        long res = 0;
        char A, B;

        for(int i = 0; i < n; i++) {
            A = a.charAt(i);
            B = b.charAt(i);

            if(A != B) {
                if(A == '?') {
                    res += ('9' - B) * count(i + 1, a);
                }
                else {
                    if(A > B) {
                        return res + count(i + 1, a);
                    }
                    else if (A < B) {
                        return res;
                    }
                }
            }
        }

        return res;
    }
    
    public static long count(int index, String s) {
        long res = 1;
        for(int i = index; i < s.length(); i++) {
            if(s.charAt(i) == '?') {
                res *= 10;
            }
        }
        return res;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t --> 0) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(findingCase(a, b));
        }
        sc.close();
    }
}
