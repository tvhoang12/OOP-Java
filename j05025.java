import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Teacher {
    private String hoten, nganh, mgv, ten;
    private static int stt = 0;
    public Teacher () {}
    public Teacher(String hoten, String nganh) {
        this.mgv = "GV" + String.format("%02d", ++stt);
        this.hoten = hoten;
        setTen(hoten);
        this.nganh = nganh;
    }

    public String getName() {
        return hoten;
    }
    public String getTen() {
        return ten;
    }
    public String getNganh() {
        return nganh;
    }
    public void setTen(String hoten) {
        String [] hotens = hoten.split(" ");
        this.ten = hotens[hotens.length - 1];
    }

    @Override
    public String toString() {
        return mgv + " " + hoten + " " + nganh;
    }
}

public class j05025 {
    public static String setNganh(String nganh) {
        String [] nganhList = nganh.split(" ");
        String res = "";
        for(int i = 0; i < nganhList.length; i ++) {
            res += nganhList[i].substring(0, 1).toUpperCase();
        }
        return res;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, ArrayList<Teacher>> teachers = new HashMap<>();
        while(t -- > 0) {
            String hoten = sc.nextLine();
            String nganh = setNganh(sc.nextLine());
            Teacher te = new Teacher(hoten, nganh);
            if(teachers.get(te.getNganh()) == null) {
                teachers.put(te.getNganh(), new ArrayList<>());
                teachers.get(te.getNganh()).add(te);
            }
            else {
                teachers.get(te.getNganh()).add(te);
            }
        }

        // Collections.sort(teachers, new Comparator<Teacher>() {
        //     @Override
        //     public int compare(Teacher t1, Teacher t2) {
        //         return t1.getTen().compareTo(t2.getTen());
        //     }
        // });

        // for(Teacher e : teachers) {
        //     System.out.println(e);
        // }
        int q = sc.nextInt();
        sc.nextLine();
        while(q --> 0) {
            String nganh = setNganh(sc.nextLine());
            System.out.println("DANH SACH GIANG VIEN BO MON " + nganh + ":");
            for(Teacher e : teachers.get(nganh)) {
                System.out.println(e);
            }
        }
        sc.close();
    }
}