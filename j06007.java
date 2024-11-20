import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class MH {
    private String mamon, tenmon;
    private double tgkh;
    
    public MH() {}
    public MH(String mamon, String tenmon) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.tgkh = 0;
    }

    public String getMamon() {
        return mamon;
    }
    public String getTenMon() {
        return tenmon;
    }
}
class GV {
    private String magv, tengv;
    private double tgd;
    private HashMap<MH, Double> dsmh = new HashMap<>();
    public GV() {}
    public GV(String magv, String tengv) {
        this.magv = magv;
        this.tengv = tengv;
        this.tgd = 0;
    }
    public String getMagv() {
        return magv;
    }
    public String getTengv() {
        return tengv;
    }
    public double getTgd() {
        return tgd;
    }

    public void setTgd(double tgd) {
        this.tgd += tgd;
    }

    public void addMH(MH mh, double tg) {
        dsmh.put(mh, tg);
        setTgd(tg);
    }


    @Override
    public String toString() {
        String s = "";
        s += "Giang vien: " + tengv + "\n";
        for (MH mh : dsmh.keySet()) {
            s += mh.getTenMon() + " " + dsmh.get(mh) + "\n";
        }
        s += String.format("Tong: %.2f", tgd);
        return s;
    }
}

public class j06007 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<MH> dsmh = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String mamon = sc.next();
            String tenmon = sc.nextLine().trim();
            dsmh.add(new MH(mamon, tenmon));
            
        }

        ArrayList<GV> dsgv = new ArrayList<>();
        t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String magv = sc.next();
            String tengv = sc.nextLine().trim();
            dsgv.add(new GV(magv, tengv));
        }

        t = sc.nextInt();
        sc.nextLine();
        while (t --> 0) {
            String magv = sc.next();
            String mamon = sc.next();
            double tgd = sc.nextDouble();
            for (int i = 0; i < dsgv.size(); i++) {
                if (dsgv.get(i).getMagv().equals(magv)) {
                    for (int j = 0; j < dsmh.size(); j++) {
                        if (dsmh.get(j).getMamon().equals(mamon)) {
                            dsgv.get(i).addMH(dsmh.get(j), tgd);
                            break;
                        }
                    }
                    break;
                }
            }
        }

        String magv = sc.next();
        // GV fgv = new GV();
        for(GV gv : dsgv) {
            if (gv.getMagv().equals(magv)) {
                System.out.println(gv);
            }
        }
    }
}
