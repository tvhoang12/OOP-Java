import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
    private String TenSP, NhomHang;
    private double LoiNhuan;
    private int id;
    private static int stt = 0;

    public MatHang() {}
    public MatHang(String TenSP, String NhomHang, double LoiNhuan) {
        this.id = ++stt;
        this.TenSP = TenSP;
        this.NhomHang = NhomHang;
        this.LoiNhuan = LoiNhuan;
    }

    public boolean isBigger(MatHang h2) {
        return LoiNhuan > h2.LoiNhuan;
    }

    @Override
    public String toString () {
        return String.format( "%d %s %s %.2f", id, TenSP, NhomHang, LoiNhuan);
    }
}

public class j05010 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> mathang = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            String tensp = sc.nextLine();
            String nhomhang = sc.nextLine();
            Double giamua = sc.nextDouble();
            Double giaban = sc.nextDouble();
            MatHang temp = new MatHang(tensp, nhomhang, (giaban - giamua));
            mathang.add(temp);
        }

        Collections.sort(mathang, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang m1, MatHang m2) {
                if(m1.isBigger(m2)) return -1;
                else if(m2.isBigger(m1)) return 1;
                else return 0;
            }
        });

        for(MatHang e: mathang) {
            System.out.println(e);
        }
    }
}
