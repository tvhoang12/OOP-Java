import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SanPham {
    private String maloai, tensp, donvitinh;
    private int giamua, giaban;
    private static int stt = 0;

    public SanPham() {}
    public SanPham(String tensp,String donvitinh, int gia1, int gia2) {
        this.maloai = String.format("MH%03d", ++stt);
        this.donvitinh = donvitinh;
        this.tensp = tensp;
        this.giamua = gia1;
        this.giaban = gia2;
    }

    public int getGiaMua() {
        return giamua;
    }
    public int getGiaBan() {
        return giaban;
    }
    public String getTensp() {
        return tensp;
    }
    public String getDonViTinh() {
        return donvitinh;
    }
    public String getMaLoai() {
        return maloai;
    }
}

class KhachHang {
    private String makh, tenkh, gioitinh, ngaysinh, diachi;
    private static int stt = 0;
    public KhachHang() {}
    public KhachHang(String tenkh, String gioitinh, String ngaysinh, String diachi) {
        this.makh = String.format("KH%03d", ++stt);
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    public String getMakh() {
        return makh;
    }
    public String getTenkh() {
        return tenkh;
    }
    public String getDiaChi() {
        return diachi;
    }
}

class HoaDon implements Comparable<HoaDon>{
    private String mahd, masp, makh;
    private KhachHang kh;
    private SanPham sp;
    private int soluong, loinhuan;
    private static int stt = 0;

    public HoaDon(SanPham sp, KhachHang kh, int soluong) {
        this.mahd = String.format("HD%03d", ++stt);
        this.sp = sp;
        this.kh = kh;
        this.soluong = soluong;
        setLoiNhuan();
    }

    public String getMakh() { 
        return makh;
    }
    public String getMasp() {
        return masp;
    }
    
    public void setLoiNhuan() {
        this.loinhuan = (this.sp.getGiaBan() - this.sp.getGiaMua()) * soluong;
    }

    @Override
    public int compareTo(HoaDon h2) {
        return -Integer.compare(loinhuan, h2.loinhuan);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %d %d", mahd, kh.getTenkh(), kh.getDiaChi(), sp.getTensp(), soluong, sp.getGiaBan()* soluong, loinhuan);
    }
}

public class j06002 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // nhap thong tin khach hang
        ArrayList<KhachHang> dskh = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            dskh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        // nhap thong tin san pham
        ArrayList<SanPham> dssp = new ArrayList<>();
        t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            dssp.add(new SanPham(sc.nextLine(),sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        
        t = sc.nextInt();
        ArrayList<HoaDon> dshd = new ArrayList<>();
        for(int i = 0; i < t; i ++) {
            String makh = sc.next();
            String masp = sc.next();
            int soluong = sc.nextInt();
            SanPham sp = new SanPham();
            KhachHang kh = new KhachHang();

            for(SanPham x: dssp) {
                if(x.getMaLoai().equals(masp)) {
                    sp = x;
                    break;
                }
            } 
            for(KhachHang x: dskh) {
                if(x.getMakh().equals(makh)) {
                    kh = x;
                    break;
                }
            }
            dshd.add(new HoaDon(sp, kh, soluong));
        }

        Collections.sort(dshd);
        for(HoaDon hd : dshd) {
            System.out.println(hd);
        }
    }
}
