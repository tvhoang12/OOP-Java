import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Movie implements Comparable<Movie> {
    private String maphim, tenphim, ngaychieu;
    private TheLoai theloai;
    private int sotap;
    private static int stt = 0;
    public Movie() {}
    public Movie(String tenphim, String ngaychieu, TheLoai theloai, int sotap) {
        maphim = String.format("P%03d", ++stt);
        this.tenphim = tenphim;
        this.ngaychieu = ngaychieu;
        this.theloai = theloai;
        this.sotap = sotap;
    }

    @Override
    public int compareTo(Movie o) {
        String [] a = this.ngaychieu.split("/");
        String [] b = o.ngaychieu.split("/");
        int [] d1 = new int[3];
        int [] d2 = new int[3];
        for(int i = 0; i < 3; i++) {
            d1[i] = Integer.parseInt(a[i]);
            d2[i] = Integer.parseInt(b[i]);
        }
        if(d1[2] < d2[2]) return -1;
        if(d1[2] > d2[2]) return 1;
        if(d1[1] < d2[1]) return -1;
        if(d1[1] > d2[1]) return 1;
        if(d1[0] < d2[0]) return -1;
        if(d1[0] > d2[0]) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d", maphim, theloai.getTenTheLoai(), ngaychieu, tenphim, sotap);
    }
}
class TheLoai {
    private String matheloai, tentheloai;
    private static int count = 0;
    public TheLoai() {}
    public TheLoai(String tentheloai) {
        this.matheloai = String.format("TL%03d", ++count);
        this.tentheloai = tentheloai;
    }
    public String getMatheloai() {
        return matheloai;
    }
    public String getTenTheLoai() {
        return tentheloai;
    }
}
public class bt1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  m = sc.nextInt();
        ArrayList<TheLoai> theloai = new ArrayList<>();
        sc.nextLine();
        while(n --> 0) {
            theloai.add(new TheLoai(sc.nextLine()));
        }
        ArrayList<Movie> movie = new ArrayList<>();
        while(m --> 0) {
            String matl = sc.nextLine();
            String ngaychieu = sc.nextLine();
            String tenphim = sc.nextLine();
            int sotap = sc.nextInt();
            TheLoai tl = new TheLoai();
            for(TheLoai i : theloai) {
                if(i.getMatheloai().equals(matl)) {
                    tl = i;
                    break;
                }
            }
            movie.add(new Movie(tenphim, ngaychieu, tl, sotap));
            
            if(m > 0) sc.nextLine();
        }
        Collections.sort(movie);
        for(Movie i : movie) {
            System.out.println(i);
        }
        sc.close();
    }
}