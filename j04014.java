import java.util.Scanner;

public class j04014 {
    static class fraction {
        private long tuso, mauso;
        fraction() {}
        fraction(long tuso, long mauso) {
            this.tuso = tuso;
            this.mauso = mauso;
        }
        public long getTuso() {
            return tuso;
        }
        public void setTuso(long tuso) {
            this.tuso = tuso;
        }
        public long getMauso() {
            return mauso;
        }
        public void setMauso(long mauso) {
            if(mauso == 0) {
                System.out.println("Mau so phai khac 0");
            }
            else {
            this.mauso = mauso;
            }
        }
        public long gcd(long a, long b) {
            if(b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
        public fraction rutgon(fraction a) {
            long gcd = gcd(a.tuso, a.mauso);
            a.tuso /= gcd;
            a.mauso /= gcd;
            return a;
        }
        public fraction cong(fraction a) {
            return rutgon(new fraction(this.tuso * a.mauso + a.tuso * this.mauso, this.mauso * a.mauso));
        }
        public fraction nhan(fraction a) {
            return rutgon(new fraction(this.tuso * a.tuso, this.mauso * a.mauso));
        }
        @Override
        public String toString() {
            return getTuso() + "/" + getMauso();
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t --> 0) {
            fraction a = new fraction(sc.nextLong(), sc.nextLong());
            fraction b = new fraction(sc.nextLong(), sc.nextLong());
            fraction c = a.cong(b);
            c = c.nhan(c);
            fraction d = a.nhan(c);
            d = d.nhan(b);
            System.out.println(c + " " + d);

        }
    }
}
