import java.util.ArrayList;
import java.util.Collection;

public class j2025 {
    static boolean ok = true;
    public static boolean checkNT(int n) {
        if(n < 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i ++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void next_binary(byte []a) {
        int i = a.length - 1;
        while(i > 0 && a[i] == 1) {
            a[i] = 0;
            i --;
        }
        if(i == 0) {
            ok = false;
            return;
        }
        else {
            a[i] = 1;
        }
    }
    
    public static void init(byte []a) {
        for(int i = 0; i < a.length; i ++) {
            a[i] = 0;
        }
    }

    public static int cal_sum(byte []a, int []b) {
        int sum = 0;
        for(int i = 0; i < a.length; i ++) {
            if(a[i] == 1) {
                sum += b[i];
            }
        }
        return sum;
    }

    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        byte t = sc.nextByte();
        while(t --> 0) {
            byte n = sc.nextByte();
            int []a = new int[n];
            byte [] bi_array = new byte[n];
            for(int i = 0; i < n; i ++) {
                a[i] = sc.nextByte();
            }

            //tao 1 mang danh dau
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();

            init(bi_array);
            while(ok) {
                next_binary(bi_array);
                ArrayList<Integer> temp = new ArrayList<>();
                if(checkNT(cal_sum(bi_array, a))) { 
                    for(int i = 0; i < n; i ++) {
                        if(bi_array[i] == 1) {
                            temp.add(a[i]);
                        }
                    }
                    res.add(temp);
                }
            }
            //sap xep
            Collection.sort(res);
            for(ArrayList<Integer> i : res) {
                for(int j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
