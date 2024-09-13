package thuchanh1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class log_thoi_gian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Tập hợp lưu trữ các mốc thời gian hợp lệ
        Set<String> timestamps = new TreeSet<>();

        // Biểu thức chính quy để nhận diện mốc thời gian hh:mm:ss
        Pattern pattern = Pattern.compile("\\b([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)\\b");

        // Đọc dữ liệu từ luồng đầu vào
        while (sc.hasNext()) {
            String line = sc.nextLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                timestamps.add(matcher.group()); // Thêm mốc thời gian hợp lệ vào tập hợp
            }
        }
        
        // In ra các mốc thời gian đã sắp xếp
        for (String timestamp : timestamps) {
            System.out.println(timestamp);
        }

        sc.close();
    }
}
