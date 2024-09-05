//Tổng giai thừa


import java.util.Scanner;

public class J01009 {
    public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n = 1;
        long sum = 1;
        for(int i = 2; i <= t; ++i)
        {
            n *= i;
            sum += n;
        }
        System.out.println(sum);
        sc.close();
    } 
}
