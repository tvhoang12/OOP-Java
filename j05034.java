import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Intern {
    private static int stt = 0;
    private String msv, hoten, lop, email, mdn;
    private int id;
    public Intern() {}
    public Intern(String msv, String hoten, String lop, String email, String mdn) {
        this.id = ++stt;
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
        this.mdn = mdn;
    }

    public String getName() {
        return hoten;
    }

    public String getMdn() {
        return mdn;
    }

    public String getMsv() {
        return msv;
    }

    public boolean isBigger(Intern i2) {
        if(mdn.compareTo(i2.mdn) > 0) {
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s %s %s",id, msv, hoten, lop, email, mdn);
    }
}


public class j05034 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<String, ArrayList<Intern>> interns = new HashMap<>();
        sc.nextLine();
        while (t-->0) {
            Intern temp = new Intern(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(interns.get(temp.getMdn()) != null) {
                interns.get(temp.getMdn()).add(temp);
            }
            else {
                interns.put(temp.getMdn(), new ArrayList<>());
                interns.get(temp.getMdn()).add(temp);
            }
        }
         for (Map.Entry<String, ArrayList<Intern>> entry : interns.entrySet()) {
            ArrayList<Intern> internlist = entry.getValue();

            // Sắp xếp mảng theo tên
            Collections.sort(internlist, Comparator.comparing(Intern::getMsv));

            // Gán lại mảng đã sắp xếp vào HashMap
            entry.setValue(internlist);
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            String mdn = sc.next();
            for(Intern s : interns.get(mdn)) {
                System.out.println(s);
            }
        }

    }
}