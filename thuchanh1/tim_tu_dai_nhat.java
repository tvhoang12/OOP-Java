package thuchanh1;
import java.util.Scanner;

public class tim_tu_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String maxWord = "";  // Lưu từ dài nhất
        int maxLength = 0;    // Lưu độ dài của từ dài nhất

        // Đọc từng từ trong luồng văn bản
        String line = sc.nextLine();
        while (line != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    maxWord = word;
                }
            }
        }
        
        // In ra từ dài nhất và độ dài của nó
        System.out.println(maxWord + "-" + maxLength);

        sc.close();
    }
}
