package thuchanh1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class tach_so_va_sap_xep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();

        int t = sc.nextInt();  // Đọc số lượng chuỗi
        sc.nextLine();  // Bỏ qua dòng mới sau khi đọc số

        for (int k = 0; k < t; k++) {
            String s = sc.nextLine() + "#";  // Đọc chuỗi và thêm ký tự '#'
            StringBuilder tmp = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (Character.isDigit(ch)) {
                    tmp.append(ch);  // Thêm ký tự số vào tmp
                } else {
                    if (tmp.length() > 0) {
                        numbers.add(tmp.toString());  // Chuyển tmp thành số và thêm vào danh sách
                        tmp.setLength(0);  // Xóa nội dung của tmp
                    }
                }
            }

        }

        // Sắp xếp và in ra các số theo thứ tự tăng dần
        Collections.sort(numbers);
        for (String number : numbers) {
            System.out.println(number);
        }

        sc.close();
    }
}
