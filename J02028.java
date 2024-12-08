import java.util.ArrayList;
import java.util.Scanner;

public class J02028 {
    static boolean ok = false;

    public static void binaryGenerator(ArrayList<Integer> arr) {
        int i = arr.size() - 1; // Bắt đầu từ phần tử cuối cùng
        while (i >= 0 && arr.get(i) == 1) {
            arr.set(i, 0); // Đặt về 0
            i--; // Di chuyển sang phần tử trước
        }
        if (i < 0) {
            ok = true; // Đã đạt cấu hình cuối cùng
        } else {
            arr.set(i, 1); // Tăng phần tử hiện tại lên 1
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Số test case
        while (t-- > 0) {
            int n = sc.nextInt(); // Số phần tử
            long k = sc.nextLong(); // Tổng cần tìm

            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> adarr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt()); // Mảng đầu vào
                adarr.add(0); // Khởi tạo cấu hình nhị phân
            }
            adarr.set(n - 1, 1);

            long sum = 0;
            ok = false; // Đặt lại trạng thái
            boolean check = false;

            while (!ok) {
                sum = 0;
                for (int i = 0; i < n; i++) {
                    if (adarr.get(i) == 1) { // Nếu bit là 1, cộng phần tử tương ứng
                        sum += arr.get(i);
                    }
                }

                if (sum == k) { // Nếu tổng bằng k
                    check = true;
                    break;
                }
                
                binaryGenerator(adarr); // Tạo cấu hình nhị phân tiếp theo
            }

            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
