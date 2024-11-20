import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;

class monhoc {
    private String mamon, tenmon;
    private int sotinchi;
    public monhoc() {}
    public monhoc(String mamon, String tenmon, int sotinchi) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotinchi = sotinchi;
    }

    public String getTenmon() {
        return tenmon;
    }
    public String getMamon() {
        return mamon;
    }
    public int getSotinchi() {
        return sotinchi;
    }
    
    @Override
    public String toString() {
        return mamon + " " + tenmon + " " + sotinchi;
    }
}

public class j07034 {
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int t = sc.nextInt();
        ArrayList<monhoc> cacmon = new ArrayList<>();
        while(t --> 0) {
            sc.nextLine();
            cacmon.add(new monhoc(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }

        Collections.sort(cacmon, new Comparator<monhoc>() {
            @Override
            public int compare(monhoc m1, monhoc m2) {
                return m1.getTenmon().compareTo(m2.getTenmon());
            }
        });

        for(monhoc m : cacmon) {
            System.out.println(m);
        }
    }
}
