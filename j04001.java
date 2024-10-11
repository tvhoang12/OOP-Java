import java.util.Scanner;

public class j04001 {
    static class Point {
        private double x, y;
        public Point() {}
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void Point(Point p) {
            this.x = p.x;
            this.y = p.y;
        }

        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }

        public double distance(Point p) {
            return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());

            System.out.printf("%.4f\n", p1.distance(p2));
        }

        sc.close();
    }
}