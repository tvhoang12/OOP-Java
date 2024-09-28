public class j03007 {
    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            boolean check = true;
            if(s.charAt(0) != '8' && s.charAt(s.length() - 1) != '8') {
                check = false;
            }
            else {
                long sum = 0;
                int left = 0, right = s.length() - 1;
                while(left < right) {
                    if(s.charAt(left) != s.charAt(right)) {
                        check = false;
                        break;
                    }
                    sum += (s.charAt(left) - '0') + (s.charAt(right) - '0');
                    left++;
                    right--;
                }
                if (left == right) {
                    sum += s.charAt(left) - '0';
                }
                if(sum % 10 != 0) {
                    check = false;
                }
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
