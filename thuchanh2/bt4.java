import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bt4 {
    public static boolean isdigit(char c) {
        return c >= '0' && c <= '9';
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<BigInteger> arr = new ArrayList<>();
        while(t --> 0) {
            String s = sc.nextLine();
            String temp = "";

            for(int i = 0; i < s.length(); i++) {
                if(isdigit(s.charAt(i))) {
                    temp += s.charAt(i);
                } else {
                    if(temp.length() > 0) {
                        BigInteger num = new BigInteger(temp);
                        arr.add(num);
                        temp = "";
                    }
                }
            }
            if(temp.length() > 0) {
                BigInteger num = new BigInteger(temp);
                arr.add(num);
            }
        }
        Collections.sort(arr);
        
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) );
        }
    }
}

