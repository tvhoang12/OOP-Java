package code_on_class;

import java.util.Scanner;

public class rectangle {
    double width, length;

    void getInformation() {
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        length = sc.nextDouble();
        sc.close();
    }

    double getArea() {
        return width * length;
    }
    double getPerimeter() {
        return (width + length) * 2;
    }
    void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
