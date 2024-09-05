import java.util.Scanner;

public class J01010 {
    static String cut(String n ) {
        String newn = "";
        for(byte i = 0; i < n.length(); i ++) {
            if (n.charAt(i) == '1') {
                newn += "1";
            }
            else if (n.charAt(i) == '0' || n.charAt(i) == '8' || n.charAt(i) == '9') {
                newn += "0";
            }
            else {
                return  "INVALID";
            }
        }
        String res = "";
        int idx = 0;
        while(idx < newn.length() && newn.charAt(idx) == '0') {
            ++idx;
        }
        for(int i = idx; i < newn.length(); i ++) {
            res += newn.charAt(i);
        }

        if (res.length() != 0)return res;
        else return "INVALID";
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        sc.nextLine();
        while (t --> 0) {
            String n = sc.nextLine();
            System.out.println(cut(n));
        }
        sc.close();
    }
}
