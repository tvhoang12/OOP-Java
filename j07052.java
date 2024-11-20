import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

class ThiSinh implements Comparable<ThiSinh> {
    private String name, id;
    private double dut, tongdiem;
    private String trangthai;

    public ThiSinh(){}
    public ThiSinh(String id, String name, double point1, double point2, double point3) {
        this.id = id;
        setName(name.trim());
        setDUT();
        this.tongdiem = point1 * 2 + point2 + point3 + this.dut;
    }

    public double getTongDiem() {
        return tongdiem;
    }

    public void setDUT() {
        switch (this.id.charAt(2)) {
            case '1':
                this.dut = 0.5;
                break;
            case '2':
                this.dut = 1.0;
                break;
            default:
                this.dut = 2.5;
                break;
        }
    }
    public void setName(String ten) {
        String [] words = ten.trim().split(" ");
        this.name = "";
        for(int i = 0; i < words.length; i ++) {
            if(words[i].length() > 0) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
                this.name += words[i] + " ";
            }
        }
        this.name = this.name.trim();
    }
    public void setTrangThai(String status) {
        this.trangthai = status;
    }

    public String formatDecimal(double d1) {
        if(d1 % 1 == 0) {
            return String.valueOf((int) d1);
        }
        else {
            return String.format("%.1f", d1);
        }
    }

    @Override
    public int compareTo(ThiSinh t2) {
        return (int) -Double.compare(tongdiem, t2.tongdiem);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + formatDecimal(dut) + " " + formatDecimal(tongdiem) + " " + trangthai;
    }
}

public class j07052 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        int t = sc.nextInt();
        while(t -- > 0) {
            sc.nextLine();
            dsts.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(dsts);

        t= sc.nextInt();
        double dtt = dsts.get(t - 1).getTongDiem();
        for(int i = 0; i < dsts.size(); i++) {
            if(dsts.get(i).getTongDiem() >= dtt) {
                dsts.get(i).setTrangThai("TRUNG TUYEN");
            }
            else {
                dsts.get(i).setTrangThai("TRUOT");
            }
        }

        System.out.printf("%.01f\n", dtt);
        for(ThiSinh ts : dsts) {
            System.out.println(ts);
        }
        sc.close();
    }
}
