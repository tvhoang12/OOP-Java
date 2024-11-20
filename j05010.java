import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

class MatHang implements Comparable<MatHang> {
    private String TenSP, NhomHang;
    private double LoiNhuan;
    private String id;
    private static int stt = 0;

    public MatHang() {}
    public MatHang(String TenSP, String NhomHang, double LoiNhuan) {
        this.id = String.format("MH%02d", ++stt);
        this.TenSP = TenSP;
        this.NhomHang = NhomHang;
        this.LoiNhuan = LoiNhuan;
    }

    @Override
    public int compareTo(MatHang h2) {
        return -Double.compare(LoiNhuan, h2.LoiNhuan);
    }

    @Override
    public String toString () {
        return String.format( "%s %s %s %.2f", id, TenSP, NhomHang, LoiNhuan);
    }
}

public class j05010 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
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

        Collections.sort(mathang);

        for(MatHang e: mathang) {
            System.out.println(e);
        }
    }
}
