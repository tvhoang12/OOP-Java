package thuchanh1;

import java.util.Scanner;

public class tich_chu_so_tong_chu_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            long sum = 0, mul = 1;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != '0') {
                    if(i % 2 == 0) {
                        mul *= s.charAt(i) - '0';
                    } else {
                        sum += s.charAt(i) - '0';
                    }
                }
            }
            System.out.println(mul + " " + sum);
        }
    }
}
