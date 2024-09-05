import java.util.Scanner;
public class j01018 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String str = sc.nextLine();
            char[] a = str.toCharArray();
            boolean fl = true;
            int sum = (int)a[0] - 48;
            for(int i = 1; i < str.length(); i ++) {
                if (Math.abs(a[i] - a[i - 1]) != 2) {
                    fl = false;
                    break;
                }
                sum += (int)a[i] - 48;
            }  
            if(sum % 10 == 0 && fl) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
