import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;

class doanhnghiep {
    private String madn, tendn;
    private int sosv;

    public doanhnghiep() {}
    public doanhnghiep(String madn, String tendn, int sosv) {
        this.madn = madn;
        this.tendn = tendn;
        this.sosv = sosv;
    }
    public String getMadn() {
        return madn;
    }
    @Override
    public String toString() {
        return madn + " " + tendn + " " + sosv;
    }
}
public class j07037 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<doanhnghiep> caccty = new ArrayList<>();
        int t = sc.nextInt();
        while(t --> 0) {
            sc.nextLine();
            caccty.add(new doanhnghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }

        Collections.sort(caccty, new Comparator<doanhnghiep>() {
            @Override
            public int compare(doanhnghiep d1, doanhnghiep d2) {
                return d1.getMadn().compareTo(d2.getMadn());
            }
        });

        for(doanhnghiep d : caccty) {
            System.out.println(d);
        }
        
        sc.close();
    }
}
