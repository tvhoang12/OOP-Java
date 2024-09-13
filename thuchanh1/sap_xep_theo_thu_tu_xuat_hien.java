package thuchanh1;
import java.util.*;

public class sap_xep_theo_thu_tu_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Số lượng bộ test
        sc.nextLine(); // Bỏ qua dòng mới sau số lượng bộ test
        
        while (T-- > 0) {
            int N = sc.nextInt();  // Số lượng phần tử trong dãy số
            sc.nextLine(); // Bỏ qua dòng mới sau số lượng phần tử
            
            Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
            List<Integer> numbers = new ArrayList<>();
            
            // Đọc dãy số và tính tần suất
            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                if (!frequencyMap.containsKey(num)) {
                    frequencyMap.put(num, 0);
                    numbers.add(num);  // Lưu trữ thứ tự xuất hiện
                }
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            }
            sc.nextLine(); // Bỏ qua dòng mới sau dãy số
            
            // Sắp xếp các số theo tần suất và thứ tự xuất hiện
            Collections.sort(numbers, new Comparator<Integer>() {
                @Override
                public int compare(Integer num1, Integer num2) {
                    int freq1 = frequencyMap.get(num1);
                    int freq2 = frequencyMap.get(num2);
                    
                    // So sánh theo tần suất xuất hiện
                    if (freq1 != freq2) {
                        return Integer.compare(freq2, freq1);
                    }
                    
                    // Nếu tần suất bằng nhau, so sánh theo thứ tự xuất hiện
                    return Integer.compare(numbers.indexOf(num1), numbers.indexOf(num2));
                }
            });
            
            // In kết quả
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
