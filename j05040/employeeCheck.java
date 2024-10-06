package j05040;
import java.util.ArrayList;
import java.util.Scanner;

public class employeeCheck {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<employee> arr = new ArrayList<>();
        while(t --> 0) {
            String empName = sc.nextLine();
            int empBaseSalary = sc.nextInt();
            int empDateWork = sc.nextInt();
            sc.nextLine();
            String empPosition = sc.nextLine();
            employee emp = new employee(empName, empBaseSalary, empDateWork, empPosition);
            arr.add(emp);
        }

        // for(employee emp : arr) {
        //     System.out.println(emp);
        // }
        // sc.close();
    }

}
