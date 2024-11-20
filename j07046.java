import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.io.File;

class khach implements Comparable<khach> {
    private String ten, makh, maphong;
    private long days;
    private static int stt = 0;
    public khach(){}
    public khach(String ten, String maphong, String ngayden, String ngaydi) {
        this.ten = ten;
        this.makh = String.format("KH%02d", ++stt);
        this.maphong = maphong;
        setDays(ngayden, ngaydi);
    }
    public void setDays(String ngayden, String ngaydi) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long diff = 0;

        try {
            Date d1 = sdf.parse(ngayden);
            Date d2 = sdf.parse(ngaydi);
            diff = (long) (d2.getTime() - d1.getTime());
            this.days = (long) (diff / (24 * 60 * 60 * 1000));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int compareTo(khach k2) {
        return (int) (k2.days - this.days);
    }

    public long getDays() {
        return days;
    }

    @Override
    public String toString() {
        return makh + " " + ten + " " + maphong + " " + days;
    }
}

public class j07046 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<khach> dskh = new ArrayList<>();
        while(t --> 0) {
            dskh.add(new khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(dskh);

        for(khach k : dskh) {
            System.out.println(k);
        }
        sc.close();
    }
}
