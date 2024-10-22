import java.util.Scanner;

public class j04018 {
    static class sophuc {
        private int a, b;
        sophuc(){}
        sophuc(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
        public sophuc add(sophuc s) {
            return new sophuc(a + s.a, b + s.b);
        }
        
        public sophuc multi(sophuc s) {
            return new sophuc(a * s.a - b * s.b, b * s.a + a * s.b);
        }
        public sophuc multiI(int i) {
            return new sophuc(a * i, b * i);
        }
        public sophuc pow2() {
            return new sophuc(a * a - b * b, 2 * a * b);
        }
        @Override
        public String toString() {
            return a + " + " + b + "i";
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            sophuc A = new sophuc(sc.nextInt(), sc.nextInt());
            sophuc B = new sophuc(sc.nextInt(), sc.nextInt());
            sophuc C = A.add(B);
            C = C.multi(A);
            sophuc D = (A.add(B)).multi(A.add(B));
            System.out.println(C + ", " + D);
        }
        sc.close();
    }
}
