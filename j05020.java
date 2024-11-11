import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class student {
    private String msv, name, clas, email;
    private String khoa;
    public student() {}
    public student(String msv, String name, String clas, String email) {
        this.msv = msv;
        this.name = name;
        this.clas = clas;
        this.email = email;
        setKhoa(msv, clas);
    }
    public String getClas() {
        return clas;
    }
    public String getMsv() {
        return msv;
    }
    public String getKhoa() {
        return khoa;
    }
    public void setKhoa(String msv, String clas) {
        if(clas.startsWith("E")) {
            if (msv.substring(3, 7) == "DCCN" || msv.substring(3, 7) == "DCAT")this.khoa = "CLC";a
        }
        else {
            switch (msv.substring(3, 7)) {
                case "DCKT":
                    this.khoa = "KE TOAN";
                    break;
                case "DCCN":
                    this.khoa = "CONG NGHE THONG TIN";
                    break;
                case "DCAT":
                    this.khoa = "AN TOAN THONG TIN";
                    break;
                case "DCVT":
                    this.khoa = "VIEN THONG";
                    break;
                default:
                    this.khoa = "DIEN TU";
                    break;
            }
        }
    }
    @Override
    public String toString() {
        return msv + " " + name + " " + clas + " " + email;
    }
}
public class j05020 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, ArrayList<student>> studentFolowClass = new HashMap<>();
        while(t --> 0) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String clas = sc.nextLine();
            String email = sc.nextLine();
            student s = new student(msv, name, clas, email);
            if(studentFolowClass.containsKey(s.getKhoa())) {
                studentFolowClass.get(s.getKhoa()).add(s);
            }
            else {
                studentFolowClass.put(s.getKhoa(), new ArrayList<>());
                studentFolowClass.get(s.getKhoa()).add(s);

            }
        }
        int q = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < q; i++) {
            String checkKhoa = sc.nextLine();
            checkKhoa = checkKhoa.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + checkKhoa + ":");
            if(studentFolowClass.get(checkKhoa) == null) continue;
            else for(student e : studentFolowClass.get(checkKhoa)) {
                System.out.println(e);
            }
        }
    }
}
