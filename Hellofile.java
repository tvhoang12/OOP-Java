import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hellofile {
    public static void main(String[] args) {
        // Đường dẫn tới file Hello.txt
        String fileName = "Hello.txt";

        // Sử dụng BufferedReader để đọc file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Đọc từng dòng trong file cho đến khi kết thúc
            while ((line = br.readLine()) != null) {
                // In từng dòng ra màn hình
                System.out.println(line);
            }
        } catch (IOException e) {
            // Xử lý ngoại lệ nếu có lỗi xảy ra
            e.printStackTrace();
        }
    }
}
