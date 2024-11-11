import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Intern {
    public String mdn, tendn;
    public int sosinhvien;

    public Intern() {}
    public Intern(String mdn, String tendn, int sosinhvien) {
        this.mdn = mdn;
        this.tendn = tendn;
        this.sosinhvien = sosinhvien;
    }
    public int getSosinhvien() {
        return sosinhvien;
    }
    public boolean isBigger(Intern i2) {
        if(sosinhvien > i2.sosinhvien) return true;
        else if (sosinhvien < i2.sosinhvien) return false;
        else {
            if(mdn.compareTo(i2.mdn) > 0) return false;
            else return true;
        }
    }
    @Override
    public String toString() {
        return mdn + " " + tendn + " " + sosinhvien;
    }
}


public class j05028 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Intern> internList = new ArrayList<>();
        while(t --> 0) {
            sc.nextLine();
            String mdn = sc.nextLine();
            String tendn = sc.nextLine();
            int sosinhvien = sc.nextInt();
            internList.add(new Intern(mdn, tendn, sosinhvien));
        }

        Collections.sort(internList, new Comparator<Intern>() {
            @Override
            public int compare(Intern i1, Intern i2) {
                if(i1.isBigger(i2)) return -1;
                else if(i2.isBigger(i1)) return 1;
                else return 0;
            }
        });

        int q = sc.nextInt();
        while(q --> 0) {
            int start = sc.nextInt(), end = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+ start +" DEN " + end + " SINH VIEN:");
            for(Intern i : internList) {
                if(i.getSosinhvien() >= start && i.getSosinhvien() <= end) {
                    System.out.println(i);
                } else if(i.getSosinhvien() < start) {
                    break;
                }
            }
        }
        sc.close();
    }
}
