package code_on_class.userACC;

public class account {
    private int id;
    private String name;
    private int balance = 0;
    private static int stt = 0;

    public account() {
    }

    public account(String name) {
        stt ++;
        this.id = stt;
        setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Amount must be greater than 0");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Amount must be greater than 0");
        } else if (amount > balance) {
            System.out.println("Amount must be less than balance");
        } else {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
