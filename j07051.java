import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.io.File;

class KhachHang implements Comparable<KhachHang>{
    private String ten, phong, makh;
    private Date ngayden, ngaydi;
    private int dvphatsinh, songayo, thanhtien, gia;
    private static int stt = 0;

    public KhachHang() {}
    public KhachHang(String ten, String phong, String ngayden, String ngaydi, int dvphatsinh) throws ParseException {
        this.makh = String.format("KH%02d", ++stt);
        setTen(ten);
        this.phong = phong.trim();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayden = sdf.parse(ngayden.trim());
        this.ngaydi = sdf.parse(ngaydi.trim());
        this.dvphatsinh = dvphatsinh;
        setSoNgayO();
        setGia();
        setThanhTien();
    }

    public void setSoNgayO() {
        this.songayo = (int) (this.ngaydi.getTime() / (24 * 60 * 60 * 1000) - this.ngayden.getTime() / (24 * 60 * 60 * 1000)) + 1;
    }
    public void setThanhTien() {
        this.thanhtien = this.songayo * this.gia + this.dvphatsinh;
    }
    public void setGia() {
        switch(this.phong.charAt(0)) {
            case '1':
                this.gia = 25;
                break;
            case '2':
                this.gia = 34;
                break;
            case '3':
                this.gia = 50;
                break;
            default:
                this.gia = 80;
                break;
        }
    }
    public void setTen(String ten) {
        String [] words = ten.trim().split(" ");
        this.ten = "";
        for(int i = 0; i < words.length; i ++) {
            if(words[i].length() > 0) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
                this.ten += words[i] + " ";
            }
        }
        this.ten = this.ten.trim();
    }

    @Override
    public int compareTo(KhachHang k2) {
        return -Integer.compare(thanhtien, k2.thanhtien);
    }

    @Override
    public String toString() {
        return makh + " " + ten + " " + phong + " " + songayo + " " + thanhtien;
    }
}

public class j07051 {
    public static void main(String [] args) throws IOException, ParseException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));

        ArrayList<KhachHang> dskh = new ArrayList<>();

        int t = sc.nextInt();
        while(t --> 0) {
            sc.nextLine();
            dskh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }

        Collections.sort(dskh);

        for(KhachHang k : dskh) {
            System.out.println(k);
        }
    }
}
