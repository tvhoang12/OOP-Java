import java.util.Scanner;

public class j03027 {
    public static String removeCharAt(String s, int i) {
        // Kiểm tra nếu vị trí i hợp lệ
        if (i < 0 || i >= s.length()) {
            throw new IllegalArgumentException("Vị trí không hợp lệ");
        }
    
        // Sử dụng phương thức substring để cắt chuỗi trước và sau ký tự i
        return s.substring(0, i) + s.substring(i + 2);
    }
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = 0;
        while(i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                s = removeCharAt(s, i);
                i = 0;
            }
            else {
                i++;
            }
        }
        if(s.isEmpty()) {
            System.out.println("Empty String");
        }
        else System.out.println(s);
    }
    
}
