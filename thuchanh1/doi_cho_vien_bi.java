package thuchanh1;
import java.util.Scanner;

public class doi_cho_vien_bi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // Đọc số lượng viên bi
        String beads = sc.next();  // Đọc chuỗi mô tả dãy viên bi
        char [] bead = beads.toCharArray();
        int countX = 0; // xanh
        int countT = 0; // trắng
        
        // Đếm số lượng viên bi mỗi màu
        for (char c : beads.toCharArray()) {
            if (c == 'X') countX++;
            else if (c == 'T') countT++;
        }

        int swaps = 0;

        // Xếp các viên bi xanh vào phần đầu của dãy
        for (int i = 0; i < countX; i++) {
            if (bead[i] != 'X') {
                swaps++;
                for(int j = countX; j < N; j++) {
                    if(bead[j] == 'X') {
                        bead[j] = bead[i];
                        bead[i] = 'X';
                        break;
                    }
                }
                // for(char z : bead) {
                //     System.out.print(z);
                // }
                // System.out.println();
            }
        }
        
        // Xếp các viên bi trắng vào phần giữa
        for (int i = countX; i < countX + countT; i++) {
            if (bead[i] != 'T') {
                swaps++;
                for (int j = countX + countT; j < N; j++) {
                    if (bead[j] == 'T') {
                        bead[j] = bead[i];
                        bead[i] = 'T';
                        break;
                    }
                }
                // for(char z : bead) {
                //     System.out.print(z);
                // }
                // System.out.println();
            }
        }
        
        // Tổng số phép đổi chỗ
        System.out.println(swaps);

        sc.close();
    }
}
