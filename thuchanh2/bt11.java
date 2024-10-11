import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bt11 {
    class student {
        private String name;
        private int totalMinute;
        student() {}
        student(String name, int totalMinute) {
            this.name = getName();
            this.totalMinute = getTotalMinute();
        }

        public String getName() {
            return name;
        }

        public int getTotalMinute() {
            return totalMinute;
        }
        public void setTotalMinute(int totalMinute) {
            this.totalMinute = totalMinute;
        }


        public void setName(String name) {
            String [] arr = name.split(" ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
            this.name = String.join(" ", arr);
        }
        public boolean bigger(student b) {
            return this.totalMinute > b.totalMinute;
        }
        
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<student> sta = new ArrayList<>();
        sc.nextLine();
        while(t --> 0) {
            String s = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();

            String [] arr = start.split(" ");
            String [] arr1 = arr[0].split("/");
            String [] arr2 = arr[1].split(":");
            int sday = Integer.parseInt(arr1[0]);
            int smonth = Integer.parseInt(arr1[1]);
            int syear = Integer.parseInt(arr1[2]);
            int shour = Integer.parseInt(arr2[0]);
            int sminute = Integer.parseInt(arr2[1]);
            int ssec = Integer.parseInt(arr2[2]);

            arr = end.split(" ");
            arr1 = arr[0].split("/");
            arr2 = arr[1].split(":");
            int eday = Integer.parseInt(arr1[0]);
            int emonth = Integer.parseInt(arr1[1]);
            int eyear = Integer.parseInt(arr1[2]);
            int ehour = Integer.parseInt(arr2[0]);
            int eminute = Integer.parseInt(arr2[1]);
            int esec = Integer.parseInt(arr2[2]);

            int totalMinute = (int)((eyear * 365 + emonth * 30 + eday) * 24 * 60 + ehour * 60 + eminute - (syear * 365 + smonth * 30 + sday) * 24 * 60 - shour * 60 - sminute );

            student st = new bt11().new student();
            st.setName(s);
            st.setTotalMinute(totalMinute);
            sta.add(st);
        }

        Collections.sort(sta, (a, b) -> {
            if(a.bigger(b)) {
                return -1;
            } else {
                return 1;
            }
        });
        for(student i:sta) {
            System.out.println(i.getName() + " " + i.getTotalMinute());
        }
    }
}
