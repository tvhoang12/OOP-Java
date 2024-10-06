package Student;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public Student() {
    }

    public Student(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        setAge(age);
        this.address = address;
        setScore(score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age must be greater than 0");
        } else {
            this.age = age;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 10) {
            System.out.println("Score must be between 0 and 10");
        } else {
            this.score = score;
        }
    }
}
