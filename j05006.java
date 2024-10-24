import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class j05006 {
    static class employee {
        private String manv, hoten, gioitinh, diachi, mst;
        private String ngaysinh, ngaykyhd;
        private static int stt = 0;

        employee() {
        }
        public employee(String hoten, String gioitinh, String ngaysinh, String diachi, String mst, String ngaykyhd) {
            this.manv = String.format("%05d", ++stt);
            this.hoten = hoten;
            this.gioitinh = gioitinh;
            this.ngaysinh = ngaysinh;
            this.diachi = diachi;
            this.mst = mst;
            this.ngaykyhd = ngaykyhd;
        }

        public boolean bigger(employee e) {
            String [] a = this.ngaysinh.split("/");
            String [] b = e.ngaysinh.split("/");
            if(Integer.parseInt(a[2]) > Integer.parseInt(b[2])) 
                return true;
            else if (Integer.parseInt(a[2]) == Integer.parseInt(b[2]) 
                    && Integer.parseInt(a[1]) > Integer.parseInt(b[1])) 
                    return true;

            else if (Integer.parseInt(a[2]) == Integer.parseInt(b[2]) 
            && Integer.parseInt(a[1]) == Integer.parseInt(b[1])
            && Integer.parseInt(a[0]) > Integer.parseInt(b[0])) 
                return true;

            else return false;
        }
        @Override
        public String toString() {
            return manv + " " + hoten + " " + gioitinh + " " + ngaysinh + " " + diachi + " " + mst + " " + ngaykyhd;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        employee [] arr = new employee[t];
        for(int i = 0; i < t; i++) {
            String hoten = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();
            String mst = sc.nextLine();
            String ngaykyhd = sc.nextLine();
            arr[i] = new employee(hoten, gioitinh, ngaysinh, diachi, mst, ngaykyhd);
        }

        Collections.sort(Arrays.asList(arr), new Comparator<employee>() {
            @Override
            public int compare(employee o1, employee o2) {
                if(o1.bigger(o2)) return 1;
                else if(o2.bigger(o1)) return -1;
                else return 0;
            }
        });

        for(employee e : arr) {
            System.out.println(e);
        }
        sc.close();
    }
}
