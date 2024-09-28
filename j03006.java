public class j03006 {
    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            boolean check = true;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) % 2 != 0) {
                    check = false;
                    break;
                }
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
    
}
