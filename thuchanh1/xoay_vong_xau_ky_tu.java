package thuchanh1;
import java.util.Scanner;

public class xoay_vong_xau_ky_tu {
    // Hàm xoay chuỗi T sao cho nó giống chuỗi mẫu target
    static int countRotations(String target, String src) {
        int len = target.length();
        for (int i = 0; i < len; i++) {
            if (src.equals(target)) return i;
            // Xoay chuỗi src
            src = src.substring(1) + src.charAt(0);
        }
        return -1; // Không thể xoay để biến src thành target
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng chuỗi N
        int N = sc.nextInt();
        sc.nextLine();  // Đọc dòng trống sau số N
        
        // Mảng để chứa các chuỗi S[i]
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = sc.nextLine();
        }

        int minSteps = Integer.MAX_VALUE;
        boolean possible = true;

        // Chọn từng chuỗi làm chuỗi mục tiêu
        for (int i = 0; i < N; i++) {
            int currentSteps = 0;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    // Tính số bước xoay từ chuỗi j thành chuỗi i
                    int rotations = countRotations(strings[i], strings[j]);
                    if (rotations == -1) {
                        possible = false;
                        break;
                    } else {
                        currentSteps += rotations;
                    }
                }
            }
            if (possible) {
                minSteps = Math.min(minSteps, currentSteps);
            } else {
                break;
            }
        }

        // In kết quả
        if (possible) {
            System.out.println(minSteps);
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
