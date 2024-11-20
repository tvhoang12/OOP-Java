import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class Student {
    private String id, name, lop, date;
    private double gpa;
    private static int stt = 0;

    public Student(){}
    public Student(String name, String lop, String date, double gpa) {
        this.id = String.format("B20DCCN%03d", ++stt);
        this.name = name;
        this.lop = lop;
        setDate(date);
        this.gpa = gpa;
    }

    public void setDate(String date) {  
        String [] dates = date.split("/");
        date = "";
        if(dates[0].length() < 2) {
            dates[0] = "0" + dates[0];
        }
        if(dates[1].length() < 2) {
            dates[1] = "0" + dates[1];
        }
        this.date = dates[0] + "/" + dates[1] + "/" + dates[2]; 
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", id, name, lop, date, gpa);
    }

}
public class j07010 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            Student sv = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());

            System.out.println(sv);
        }
        sc.close();
    }
}
