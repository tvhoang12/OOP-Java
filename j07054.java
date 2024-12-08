import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien> {
    private String id, name;
    private double tb;
    private static int stt = 0;
    private int xh;

    public SinhVien() {}

    public SinhVien(String name, double point1, double point2, double point3) {
        this.id = String.format("sv%02d", ++stt);
        setName(name);
        tb = (point1 * 3 + point2 * 3 + point3 * 2) / 8;
    }

    public void setName(String name) {
        String [] words = name.trim().split(" ");
        this.name = "";
        for(String i : words) {
            if(i.length() > 0) {
                this.name += Character.toUpperCase(i.charAt(0)) 
                            + i.substring(1).toLowerCase() + " ";
            }
        }
    }
    public void setXH(int s) {
        this.xh = s;
    }

    public double getTB() {
        return tb;
    }
    public int getXH() {
        return xh;
    }

    @Override
    public int compareTo(SinhVien s2) {
        if(this.tb != s2.tb) {
            return -Double.compare(tb, s2.tb);
        }
        else {
            return this.id.compareTo(s2.id);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.02f %d", id, name, tb, xh);
    }
}


public class j07054 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        
        ArrayList<SinhVien> dssv = new ArrayList<>();
        int t = sc.nextInt();
        while (t-->0) {
            sc.nextLine();
            dssv.add(new SinhVien(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }

        Collections.sort(dssv);
        for(int i = 0; i < dssv.size(); i++) {
            if(i == 0) {
                dssv.get(i).setXH(1);
            }
            else {
                if(dssv.get(i).getTB() == dssv.get(i - 1).getTB()) {
                    dssv.get(i).setXH(dssv.get(i - 1).getXH());
                }
                else {
                    dssv.get(i).setXH(i + 1);
                }
            }
        }

        for(SinhVien s : dssv) {
            System.out.println(s);
        }
        sc.close();
    }
}
