import java.util.ArrayList;
import java.util.Scanner;

class Student extends Nhom {
    private String msv, hoten, sdt;
    private int idnhom;

    public Student() {}
    public Student(String msv, String hoten, String sdt, int idnhom) {
        this.msv = msv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.idnhom = idnhom;
    }

    public int getIdNhom() {
        return idnhom;
    }
    public String getMsv() {
        return msv;
    }
    @Override
    public String toString() {
        return msv + " " + hoten + " " + sdt + " " + idnhom;
    }
}

class Nhom {
    protected String tennhom;
    private static int sttnhom = 0;
    protected int idnhom;
    public Nhom() {}
    public Nhom(String tennhom) {
        this.idnhom = sttnhom + 1;
        this.tennhom = tennhom;
    }

    public String getTennhom() {
        return tennhom;
    }
    public int getIdNhom() {
        return idnhom;
    }
    @Override
    public String toString() {
        return tennhom;
    }
}
public class j06003 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Student> btl = new ArrayList<>();
        sc.nextLine();
        while(m --> 0) {
            Student temp = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            btl.add(temp);
        }

        btl.sort((s1, s2) -> s1.getMsv().compareTo(s2.getMsv()));

        ArrayList<Nhom> nhoms = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Nhom temp = new Nhom(sc.nextLine());
            nhoms.add(temp);
        }
        
        for(Student s : btl) {
            String tennhom = nhoms.get(s.getIdNhom() - 1).getTennhom();
            System.out.print(s + " ");
            System.out.println(tennhom);
        }
        sc.close();
    }
}
