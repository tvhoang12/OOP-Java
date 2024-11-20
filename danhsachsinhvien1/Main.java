package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.*;

// Lớp SinhVien triển khai Serializable
class SinhVien implements Serializable {
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private double gpa;
    private static int stt = 0;
    
    // Constructor
    public SinhVien(String ten, String lop, String ngaysinh, double gpa) throws ParseException {
        // Tạo mã sinh viên theo quy tắc B20DCCN + id (đủ 3 chữ số)
        this.ma = "B20DCCN" + String.format("%03d", ++ stt);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    // Phương thức hiển thị thông tin sinh viên
    @Override
    public String toString() {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return this.ma + " " + this.ten + " " + this.lop + " " + sdf.format(this.ngaysinh) + " " + String.format("%.2f", this.gpa);
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> danhSachSinhVien = (ArrayList<SinhVien>) input.readObject();

        // In danh sách sinh viên
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }
        input.close();
    }
}