import java.util.Scanner;
public class J01011 {
    static long findGCD(long x, long y) {
        if (y == 0) {
            return x;
        }
        else return findGCD(y, x % y);
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t --> 0) {
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.println(a * b / findGCD(a, b) + " " + findGCD(a, b));
        }
        sc.close();
    }
}
