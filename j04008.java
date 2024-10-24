import java.util.Scanner;

public class j04008 {
    static class Point {
        private double x, y;
        Point() {}
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        
        public double distance(Point p) {
            return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        }
        
        @Override
        public String toString() {
            return String.format("%.2f %.2f", x, y);
        }

        public static Point nextPoint(Scanner sc) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            return new Point(x, y);
        }
    }
    
    static class Triangle {
        private Point a, b, c;
        Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public String getPerimeter() {
            return String.format("%.03f", a.distance(b) + b.distance(c) + c.distance(a));
        }
        public boolean valid() {
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ca = c.distance(a);
            return ab + bc > ca && ab + ca > bc && bc + ca > ab;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
