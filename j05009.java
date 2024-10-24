import java.util.Scanner;

public class j05009 {
    static class student {
        private String id, name, dateOfBirth;
        private float gpa;
        private float point1, point2, point3;
        private static int stt = 0;

        student() {
        }
        public student(String name, String dateOfBirth, float point1, float point2, float point3) {
            this.id = String.format("%d", ++stt);
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
            this.gpa = setGPA();
        }
        public String getName() {
            return name;
        }
        public String getDateOfBirth() {
            return dateOfBirth;
        }
        public float getGpa() {
            return gpa;
        }
        public float setGPA() {
            return (point1 + point2 + point3);
        }
        public boolean bigger(student s) {
            return this.gpa > s.gpa;
        }
        @Override
        public String toString() {
            return id + " " + name + " " + dateOfBirth + " " + String.format("%.1f", gpa);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        student [] sarr = new student[t];
        float max = 0;
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String dateOfBirth = sc.nextLine();
            float point1 = sc.nextFloat();
            float point2 = sc.nextFloat();
            float point3 = sc.nextFloat();
            sarr[i] = new student(name, dateOfBirth, point1, point2, point3);
            if(sarr[i].getGpa() > max) {
                max = sarr[i].getGpa();
            }
        }
        for(student i : sarr) {
            if(i.getGpa() == max) {
                System.out.println(i);
            }
        }
        sc.close();
    }
    
}
