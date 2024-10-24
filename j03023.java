import java.util.Scanner;

public class j03023 {
    static class pair {
        private String first;
        private int second;
        pair(String first, int second) {
            this.first = first;
            this.second = second;
        }
    }   
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pair [] p = new pair[7];
        p[0] = new pair("I", 1);
        p[1] = new pair("V", 5);
        p[2] = new pair("X", 10);
        p[3] = new pair("L", 50);
        p[4] = new pair("C", 100);
        p[5] = new pair("D", 500);
        p[6] = new pair("M", 1000);
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            int number []= new int[s.length()];
            for(int i = s.length() - 1; i >= 0; i--) {
                for(int j = 0; j < 7; j++) {
                    if(s.charAt(i) == p[j].first.charAt(0)) {
                        number[i] = p[j].second;
                        break;
                    }
                }
            }
            int res = number[s.length() - 1];
            for(int i = s.length() - 2; i >= 0; i --) {
                if(number[i] < number[i + 1]) {
                    res -= number[i];
                } else {
                    res += number[i];
                }
            }
            System.out.println(res);    
        }
        sc.close();
    }
}
