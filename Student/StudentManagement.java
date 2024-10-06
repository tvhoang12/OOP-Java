package Student;

public class StudentManagement {
    public static void main(String[] args) {
        Student student = new Student(1001, "John", 20, "123 Street", 9);
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Score: " + student.getScore());
    }
}