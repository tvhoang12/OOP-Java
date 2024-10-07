public class j3008 {
    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            char [] prime = {'2', '3', '5', '7'};
            String s = sc.nextLine();
            boolean check = true;
            int left = 0, right = s.length() - 1;
            while(left < right) {
                if(s.charAt(left) != s.charAt(right)) {
                    check = false;
                    break;
                }
                else {
                    boolean check2 = false;
                    for(char i : prime) {
                        if(s.charAt(left) == i) {
                            check2 = true;
                            break;
                        }
                    }
                    if(!check2) {
                        check = false;
                        break;
                    }
                }
                left++;
                right--;
            }
            System.out.println(check ? "YES" : "NO");
        }

    sc.close();
    }
}
