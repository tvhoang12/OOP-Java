import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String msv, hoten, lop;
    private float diem1, diem2, diem3;

    public Student() {}
    public Student(String msv, String hoten, String lop, float diem1, float diem2, float diem3) {
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public String getMsv() {
        return msv;
    }
    public String getHoten() {
        return hoten;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %.1f %.1f", msv, hoten, lop, diem1, diem2, diem3);
    }
}

public class j05030 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            String msv = sc.nextLine();
            String hoten = sc.nextLine();
            String lop = sc.nextLine();
            float diem1 = sc.nextFloat();
            float diem2 = sc.nextFloat();
            float diem3 = sc.nextFloat();
            students.add(new Student(msv, hoten, lop, diem1, diem2, diem3));
        }
        students.sort((s1, s2) -> s1.getHoten().compareTo(s2.getHoten()));
        
        for (int i = 0; i < t; i++) {
            System.out.println((i+1) + " " + students.get(i));
        }
    }
}
