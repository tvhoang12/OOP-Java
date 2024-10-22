import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class j05081 {
    static class hang{
        private String name, donvi, mamh;
        private int giamua, giaban;
        private static int stt = 0;
        hang(){}
        hang(String name, String donvi, int giamua, int giaban){
            this.name = name;
            this.donvi = donvi;
            this.giamua = giamua;
            this.giaban = giaban;
            this.mamh = "MH" + String.format("%03d", ++stt);
        }
        public String getName(){
            return name;
        }
        public String getDonvi(){
            return donvi;
        }
        public int getGiamua(){
            return giamua;
        }
        public int getGiaban(){
            return giaban;
        }
        public int getLoiNhuan() {
            return giaban - giamua;
        }
        @Override
        public String toString(){
            return mamh + " " + name + " " + donvi + " " + giamua + " " + giaban + " " + getLoiNhuan();
        }
        public boolean bigger(hang h){
            int l1 = getLoiNhuan();
            int l2 = h.getLoiNhuan();
            return l1 > l2;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        hang [] harr = new hang[t];
        for(int i = 0; i < t; i++) { 
            sc.nextLine();
            harr[i] = new hang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Collections.sort(Arrays.asList(harr), new Comparator<hang>(){
            @Override
            public int compare(hang h1, hang h2) {
                if(h1.bigger(h2)) return -1;
                else if (h2.bigger(h1)) return 1;
                else return 0;
            }
        });
        for(hang i : harr) {
            System.out.println(i);
        }
        sc.close();
    }
}