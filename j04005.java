import java.util.Scanner;

public class j04005 {
    class student {
        private String name, birthdate, className;
        private double gpa;

        student() {
        }
        public student(String name, String birthdate, double point1, double point2, double point3) {
            this.name = name;
            this.className = className;
            this.birthdate = getBirthdate();
            this.gpa = gpa;
        }

        public String getName() {
            String [] arr = name.split(" ");
            name = "";
            for(String i : arr) {
                i = String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1).toLowerCase();
                name += i + " ";
            }

            return name;
        }

        public String getBirthdate() {
            if(!birthdate.contains("/")) {
                if(birthdate.length() == 8) {
                    birthdate = birthdate.substring(0, 2) + "/" + birthdate.substring(2, 4) + "/" + birthdate.substring(4);
                }
                else if(birthdate.length() == 7) {
                    birthdate = "0" + birthdate.substring(0, 1) + "/" + birthdate.substring(1, 3) + "/" + birthdate.substring(3);
                }
                else if(birthdate.length() == 6) {
                    birthdate = "0" + birthdate.substring(0, 1) + "/0" + birthdate.substring(1, 2) + "/" + birthdate.substring(2);
                }
            }
            else {
                if(birthdate.charAt(2) != '/') {
                    birthdate = "0" + birthdate;
                }   
                if(birthdate.charAt(5) != '/') {
                    birthdate = birthdate.substring(0, 3) + "0" + birthdate.substring(3);
                }
            }
            return birthdate;
        }

        public String getGPA() {
            return String.format("%.2f", gpa);
        }

        public String getClassName() {
            return className;
        }

    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        student st = new j04005().new student();
        st.name = sc.nextLine();
        st.className = sc.nextLine();
        st.birthdate = sc.nextLine();
        st.gpa = sc.nextDouble();
        System.out.println("B20DCCN001 " + st.getName() + " " + st.getClassName() + " " +st.getBirthdate() + " " + st.getGPA());
        sc.close();
    }
}
