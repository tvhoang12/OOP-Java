import java.util.Scanner;

public class Employee {
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if(salary < 0) {
            salary = 0;
        }
        else {
            this.salary = salary;
        }
    }

    public void in() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        salary = sc.nextInt();
    }
    public void display() {
        System.out.printf("%s %s", name, salary);
    }
}