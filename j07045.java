import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong> {
    private String KH, TenLoai;
    private int dongiangay;
    private double phiphucvu;

    public LoaiPhong() {}
    public LoaiPhong(String info) {
        String [] infos = info.split(" ");
        this.KH = infos[0];
        this.TenLoai = infos[1];
        this.dongiangay = Integer.parseInt(infos[2]);
        this.phiphucvu = Double.parseDouble(infos[3]);
    }

    @Override
    public int compareTo(LoaiPhong l2) {
        return this.TenLoai.compareTo(l2.TenLoai);
    }

    public String getTenLoai() {
        return TenLoai;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.02f", KH, TenLoai, dongiangay, phiphucvu);
    }
}

public class j07045 {
        public static void main(String[] args) throws IOException {
            ArrayList<LoaiPhong> ds = new ArrayList<>();
            Scanner in = new Scanner(new File("PHONG.in"));
            int n = Integer.parseInt(in.nextLine());
            while(n-->0){
                ds.add(new LoaiPhong(in.nextLine()));
            }
            Collections.sort(ds);
            for(LoaiPhong tmp : ds){
                System.out.println(tmp);
            }
        }
}
