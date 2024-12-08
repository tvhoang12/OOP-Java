import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class KhachHang {
    private String makh, ten, giotinh, ngaysinh, diachi;
    private static int count = 0;
    public KhachHang() {}
    public KhachHang(String ten, String giotinh, String ngaysinh, String diachi) {
        this.makh = String.format("KH%03d", ++count);
        this.ten = ten;
        this.giotinh = giotinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    public String getMa() {
        return this.makh;
    }
    public String getTen() {
        return this.ten;
    }
    public String getDiaChi() {
        return this.diachi;
    }
}
class MatHang {
    private String mamh, tenmh, donvitinh;
    private int giamua, giaban;
    private static int count = 0;

    public MatHang() {}
    public MatHang(String tenmh, String donvitinh, int giamua, int giaban) {
        this.mamh = String.format("MH%03d", ++count);
        this.tenmh = tenmh;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    public String getMakh() {
        return mamh;
    }
    public int getGiaban() {
        return giaban;
    }
    public int getGiamua() {
        return giamua;
    }
    public String getTenmh() {
        return tenmh;
    }
    public String getDonvitinh() {
        return donvitinh;
    }
}
class HoaDon implements Comparable<HoaDon> {
    private HoaDon hd;
    private KhachHang kh;
    private MatHang mh;
    private String mahd;
    private int soluong, loinhuan, thanhtien;
    private static int count = 0;

    public HoaDon() {}
    public HoaDon(KhachHang kh, MatHang mh, int soluong) {
        this.mahd = String.format("HD%03d", ++count);
        this.kh = kh;
        this.mh = mh;
        this.soluong = soluong;
        setLoiNhuan();
        this.thanhtien = this.mh.getGiaban() * this.soluong;
    }

    public void setLoiNhuan() {
        this.loinhuan = (this.mh.getGiaban() - this.mh.getGiamua()) * this.soluong;
    }

    @Override
    public int compareTo(HoaDon o) {
        return -Integer.compare(this.loinhuan, o.loinhuan);
    }

    @Override
    public String toString() {
        return mahd + " " + kh.getTen() + " " + kh.getDiaChi() + " " + mh.getTenmh() + " " + soluong + " " + thanhtien + " " + loinhuan;
    }

}

public class bt4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        ArrayList<KhachHang> dskh = new ArrayList<>();
        sc.nextLine();
        while (n --> 0) {
            dskh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        ArrayList<MatHang> dsmh = new ArrayList<>();
        n = sc.nextInt();
        while (n-->0) {
            sc.nextLine();   
            dsmh.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }

        n = sc.nextInt();
        ArrayList<HoaDon> hd = new ArrayList<>();
        while (n-->0) {
            String makh = sc.next();
            String mamh = sc.next();
            int soluong = sc.nextInt();
            KhachHang kh = new KhachHang();
            MatHang mh = new MatHang();
            for(KhachHang k : dskh) {
                if(k.getMa().equals(makh)) {
                    kh = k;
                    break;
                }
            }
            for(MatHang m:dsmh) {
                if(m.getMakh().equals(mamh)) {
                    mh = m;
                    break;
                }
            }
            hd.add(new HoaDon(kh, mh, soluong));
        }

        Collections.sort(hd);
        for(HoaDon i : hd) {
            System.out.println(i);
        }
    }
}
