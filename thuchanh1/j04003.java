package thuchanh1;

import java.util.Scanner;

public class j04003 {
    class Fraction {
        long tu, mau;
        Fraction() {}
        public Fraction(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }
        public int getTu() {
            return (int) tu;
        }
        public int getMau() {
            return (int) mau;
        }
        public void setTu(long tu) {
            this.tu = tu;
        }
        public void setMau(long mau) {
            this.mau = mau;
        }

        public long gcd(long a, long b) {
            if(b == 0) return a;
            return gcd(b, a % b);
        }
        public void rutgon() {
            long x = gcd(tu, mau);
            tu /= x;
            mau /= x;
        }

        public void addFraction(j04003.Fraction b) {
            tu = tu * b.mau + b.tu * mau;
            mau = mau * b.mau;
            rutgon();
        }
        @Override
        public String toString() {
            return tu + "/" + mau;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f = new j04003().new Fraction();
        Fraction f2 = new j04003().new Fraction();

        f.setTu(sc.nextLong());
        f.setMau(sc.nextLong());
        f2.setTu(sc.nextLong());
        f2.setMau(sc.nextLong());
        f.addFraction(f2);
        
        System.out.println(f.toString());
    }
}
