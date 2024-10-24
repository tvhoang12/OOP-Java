import java.util.Scanner;

public class j05040 {
    static class employee {
        private String empID;
        private String empName;
        private int empBaseSalary;
        private int empDateWork;
        private String empPosition;
        private long luong;
        private long thuong;
        private long phuCap;
        private long thuNhap;
        private static int stt = 0;
        
        public employee(String empName, int empBaseSalary, int empDateWork, String empPosition) {
            this.empID = String.format("NV%02d", ++stt);
            this.empName = empName;
            this.empBaseSalary = empBaseSalary;
            this.empDateWork = empDateWork;
            this.empPosition = empPosition;
            this.luong = empBaseSalary * empDateWork;
            this.thuong = getThuong(thuong);
            this.phuCap = getPhuCap(phuCap);
            this.thuNhap = getThuNhap(thuNhap);
        }

        public long getPhuCap(long phuCap) {
            switch (empPosition) {
                case "GD":
                    return 250000;
                case "PGD":
                    return 200000;
                case "TP":
                    return 180000;
                default:
                    return 150000;
            }
        }

        private long getThuong(long thuong) {
            if(empDateWork >= 25) {
                thuong = luong * 2 / 10;
            } else if(empDateWork >= 20 && empDateWork < 25) {
                thuong = luong / 10;
            } else {
                thuong = 0;
            }
            return thuong;
        }

        private long getThuNhap(long thuNhap) {
            return empBaseSalary * empDateWork + thuong + phuCap;
        }

        @Override
        public String toString() {
            return empID + " " + empName  + " " + luong + " " + thuong + " " + phuCap + " " + thuNhap;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
    
            String empName = sc.nextLine();
            int empBaseSalary = sc.nextInt();
            int empDateWork = sc.nextInt();
            sc.nextLine();
            String empPosition = sc.nextLine();
            employee emp = new employee(empName, empBaseSalary, empDateWork, empPosition);
            
            System.out.println(emp);

    }
}
