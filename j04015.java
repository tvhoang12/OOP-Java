import java.util.Scanner;

public class j04015 {
    class teacher {
        private String name, chucvu, mangach;
        private int luongcb, phucap, heso;
        public teacher() {}
        public teacher(String mangach, String name, int luongcb) {
            this.mangach = mangach;
            this.name = name;
            this.chucvu = getChucvu();
            this.heso = getHeso();
            this.luongcb = luongcb;
            this.phucap = getPhucap();
        }

        public String getChucvu() {
            return mangach.substring(0, 2);
        }
        public int getHeso() {
            return Integer.parseInt(mangach.substring(2, 4));
        }
        public int getLuongCB() {
            return luongcb;
        }
        public int getPhucap() {
            return phucap;
        }

        public int getLuong() {
            return luongcb * heso + phucap;
        }

        public void setPhucap() {
            switch (chucvu) {
                case "HT":
                    phucap = 2000000;
                    break;
                case "HP":
                    phucap = 900000;
                    break;
                default:
                    phucap = 500000;
                    break;
            }
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %d %d", mangach, name, heso, phucap, getLuong());
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        teacher t = new j04015().new teacher(sc.nextLine(), sc.nextLine(), sc.nextInt());
        t.setPhucap();
        // System.out.println(t.getPhucap());
        System.out.println(t.toString());

        
        sc.close();
    }

}
