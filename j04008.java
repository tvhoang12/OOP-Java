import java.util.Scanner;

public class j04008 {
    class point {
        private double x, y;
        point() {}
        point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        point(point p) {
            this.x = p.x;
            this.y = p.y;
        }

        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        
        public double distance(point p) {
            return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        }
        
        @Override
        public String toString() {
            return String.format("%.2f %.2f", x, y);
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            point[] p = new point[3];

            for(int i = 0; i < 3; i++) {
                p[i] = new j04008().new point(sc.nextDouble(), sc.nextDouble());
            }

            if(p[0].distance(p[1]) + p[1].distance(p[2]) <= p[0].distance(p[2]) || p[0].distance(p[2]) + p[2].distance(p[1]) <= p[0].distance(p[1]) || p[0].distance(p[2]) + p[1].distance(p[0]) <= p[2].distance(p[1])) {
                System.out.println("INVALID");
            } else {
                System.out.printf("%.3f", p[0].distance(p[1]) + p[1].distance(p[2]) + p[0].distance(p[2]));
            }
            System.out.println();
        }
        
        sc.close();
    }
}
