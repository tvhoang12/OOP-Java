package code_on_class;

import java.util.Scanner;

public class ex1 {
    String code;
    String name;
    int birthYear;
    String address;

    // void input() {
    //     Scanner sc = new Scanner(System.in);
    //     code = sc.next();
    //     sc.nextLine();
    //     name = sc.nextLine();
    //     birthYear = sc.nextInt();
    //     sc.nextLine();
    //     address = sc.nextLine();
    //     sc.close();
    // }

    ex1() {
        code = "B20DCCN001";
        name = "Nguyen Van A";
        birthYear = 2000;
        address = "Ha Noi";
    }
    ex1(String code, String name, int birthYear, String address) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }
    void display() {
        System.out.println(code + " " + name + " " + birthYear + " " + address);
    }
}
