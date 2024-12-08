import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class LienLac {
    private String ten, sdt, ngay;

    public LienLac() {
    }
    public LienLac(String ngay, String ten, String sdt) {
        this.ten = ten + ":";
        this.sdt = sdt;
        this.ngay = ngay;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", ten, sdt, ngay);
    }
}
public class saochepdb {
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(new File("SOTAY.txt"));
        ArrayList<LienLac> dsll = new ArrayList<>();
        while(sc.hasNextLine()) {
            String ngay = sc.next();
            if(ngay.equals("Ngay")) {
                ngay = sc.next();
                sc.nextLine();
            } 
            while(sc.hasNextLine() && !sc.hasNext("Ngay")) {
                String ten = sc.nextLine();
                String sdt = sc.nextLine();
                dsll.add(new LienLac(ngay, ten, sdt));
            }
        }
        for(LienLac i : dsll) {
            System.out.println(i);
        }
    }
}
