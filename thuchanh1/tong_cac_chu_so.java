package thuchanh1;

import java.util.ArrayList;
import java.util.Scanner;

public class tong_cac_chu_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte(); 
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            int sum = 0;
            ArrayList<String> arr = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    sum += s.charAt(i) - '0'; 
                } else {
                    arr.add(s.charAt(i) + ""); 
                }
            }
            arr.sort((a,b) -> a.compareTo(b));
            for (String i : arr) {
                System.out.print(i);
            }
            System.out.println(sum); 
            
        }

        sc.close();
    }
}
