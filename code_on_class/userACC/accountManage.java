package code_on_class.userACC;
public class accountManage {
    public static void main(String[] args) {
        account acc1 = new account("John");

        acc1.deposit(500);
        acc1.display();
        acc1.withdraw(200);
        acc1.display();
        acc1.withdraw(2000);
        acc1.display();
    }
}
