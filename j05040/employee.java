package j05040;
public class employee {
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
        this.empID = String.format("NV%05d", stt++);
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
            thuong = empBaseSalary * 2 / 10;
        } else if(empDateWork >= 20 && empDateWork < 25) {
            thuong = empBaseSalary / 10;
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
        return empID + " " + empName + " " + empBaseSalary + " " + empDateWork + " " + empPosition + " " + luong + " " + thuong + " " + phuCap + " " + thuNhap;
    }
}
