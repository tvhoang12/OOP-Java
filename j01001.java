import java.util.Scanner;
public class j01001 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int longSide = sc.nextInt();
    int shortSide = sc.nextInt();

    if (longSide <= 0  || shortSide <= 0) {
        System.out.println(0);
        sc.close();
        return;
    }

    System.out.print(((longSide + shortSide) * 2) + " ");
    System.out.print(longSide * shortSide);
    sc.close();
    }
}
