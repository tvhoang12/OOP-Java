public class j01024 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            boolean check = true;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2')
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
