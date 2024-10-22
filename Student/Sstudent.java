package Student;

import java.util.Scanner;

public class Sstudent {
    static class student {
        private int id;
        private String name;
        private String birthDate;
        private String clas;
        private float GPA;

        public student() {
        }

        public student(int id, String name, String birthDate, String clas, int GPA) {
            this.id = id;
            this.name = name;
            this.birthDate = birthDate;
            this.clas = clas;
            this.GPA = GPA;
        }

        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getBirthDate() {
            return birthDate;
        }
        public String getClas() {
            return clas;
        }
        public float getGPA() {
            return GPA;
        }

        public void setName(String name) {
            String [] arr = name.split(" ");
            for (String i : arr) {
                if (i.length() > 0) {
                    this.name = i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase();
                    break;
                }
            }
            name = "";
            for (int i = 0; i < arr.length; i++) {
                name += arr[i];
                if (i < arr.length - 1) {
                    name += " ";
                }
            }
        }
        public void setBirthDate(String birthDate) {
            if(birthDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
                this.birthDate = birthDate;
            } else {
                this.birthDate = "01/01/2000";
            }
        }
        public void setGPA(float GPA) {
            if (GPA >= 0 && GPA <= 4) {
                this.GPA = GPA;
            } else {
                this.GPA = 0;
            }
        }
        @Override
        public String toString() {
            return String.format("%s %s %s %s %.2f",id, name, birthDate, clas, GPA);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            student s = new student();
            s.id = sc.nextInt();
            sc.nextLine();
            s.setName(sc.nextLine());
            s.setBirthDate(sc.nextLine());
            s.clas = sc.nextLine();
            s.setGPA(sc.nextFloat());
            System.out.println(s);
        }
        sc.close();
    }
}
