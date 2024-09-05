public class j01026 {
    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int sq = (int)Math.sqrt(n);
            if(sq * sq == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }   
        sc.close();
    }
    
}
