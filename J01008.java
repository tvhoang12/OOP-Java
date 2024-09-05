
import java.util.*;

public class J01008
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sumall = 0;
        for(int i = 1; i <= t; ++i)
        {
            int n = sc.nextInt();
            int sum = 0;
            for(int j = 2; j <= Math.sqrt(n); ++j)
            {
                if(n % j == 0)
                {
                    while(n % j == 0)
                    {
                        sum += j;
                        n /= j;
                    }
                }
            }
            if(n > 1)
            {
                sum += n;
            }
            sumall += sum;
        }
        System.out.println(sumall);
        sc.close();
    }
}