import java.util.Scanner;

public class j04007 {
    class employee {
        private String name, gender, birthdate, address, taxCode, dateOfContract;
        private String id = "00001";
        
        employee() {
        }

        public employee(String name, String gender, String birthdate, String address, String taxCode, String dateOfContract) {
            this.name = name;
            this.gender = gender;
            this.birthdate = birthdate;
            this.address = address;
            this.taxCode = taxCode;
            this.dateOfContract = dateOfContract;
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %s %s %s %s", id, name, gender, birthdate, address, taxCode, dateOfContract);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee e = new j04007().new employee();
        e.name = sc.nextLine();
        e.gender = sc.nextLine();
        e.birthdate = sc.nextLine();
        e.address = sc.nextLine();
        e.taxCode = sc.nextLine();
        e.dateOfContract = sc.nextLine();
        System.out.println(e.toString());

        sc.close();
    }
}
