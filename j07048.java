import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SanPham implements Comparable<SanPham> {
    private String masp, tensp;
    private int giaban, thoihan;

    public SanPham() {}
    public SanPham(String masp, String tensp, int giaban, int thoihan) {
        this.masp = masp;
        this.tensp = tensp;
        this.giaban = giaban;
        this.thoihan = thoihan;
    }

    @Override
    public int compareTo(SanPham s2) {
        if(giaban - s2.giaban != 0) {
            return -Integer.compare(giaban, s2.giaban);
        }
        else {
            return masp.compareTo(s2.masp);
        }
    }

    @Override
    public String toString() {
        return masp + " " + tensp + " " + giaban + " " + thoihan;
    }
}


public class j07048 {
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> dssp = new ArrayList<>();
        int t = sc.nextInt();
        while(t --> 0) {
            sc.nextLine();
            dssp.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(dssp);
        for(SanPham s : dssp) {
            System.out.println(s);
        }
        sc.close();
    }
}
