import java.io.IOException;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class ThiSinh {
    private String name, id;
    private String xeploai;
    private double lythuyet, thuchanh, dt;
    private static int stt = 0;
    private int dtb, tuoi;
    
    public ThiSinh() {}
    public ThiSinh(String name, String ngaysinh, double lythuyet, double thuchanh) throws ParseException {
        this.id = String.format("PH%02d", ++stt);
        setName(name);
        setTuoi(ngaysinh);
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
        setDT();
        setDTB();
        setXepLoai();
    }

    public void setTuoi(String ngaysinh) {
        String [] words = ngaysinh.split("/");
        this.tuoi = 2021 - Integer.parseInt(words[2]);
    }
    public void setDT() {
        if(this.lythuyet >= 8 && this.thuchanh >= 8) {
            this.dt = 1;
        }
        else if(this.lythuyet >= 7.5 && this.thuchanh >= 7.5) {
            this.dt = 0.5;
        }
        else this.dt = 0;
    }
    public void setDTB() {
        this.dtb = (int) Math.min(10, (Math.round((this.lythuyet + this.thuchanh) / 2.0 ) + this.dt));
    }
    public void setXepLoai() {
        if(this.dtb == 10 || this.dtb == 9) this.xeploai = "Xuat sac";
        else if(this.dtb == 8) this.xeploai = "Gioi";
        else if(this.dtb == 7) this.xeploai = "Kha";
        else if(this.dtb == 5 || this.dtb == 6) this.xeploai ="Trung binh";
        else this.xeploai = "Truot";
    }
    public void setName(String ten) {
        String [] words = ten.trim().split(" ");
        this.name = "";
        for(int i = 0; i < words.length; i ++) {
            if(words[i].length() > 0) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
                this.name += words[i] + " ";
            }
        }

        this.name = this.name.trim();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + tuoi + " " + dtb + " " + xeploai;
    }
}

public class j07053 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = sc.nextInt();
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        while(t --> 0) {
            sc.nextLine();
            dsts.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }

        for(ThiSinh ts : dsts) {
            System.out.println(ts);
        }
        sc.close();
    }
}
