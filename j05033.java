import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class j05033 {
    static class time {
        private int hour, minute, second;
        time(){}
        time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        public int getHour() {
            return hour;
        }
        public int getMinute() {
            return minute;
        }
        public int getSecond() {
            return second;
        }
        public boolean bigger(time t) {
            int tim = hour * 3600 + minute * 60 + second;
            int tim2 = t.getHour() * 3600 + t.getMinute() * 60 + t.getSecond();
            return tim > tim2;
        }
        @Override
        public String toString() {
            return String.format("%02d %02d %02d", hour, minute, second);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        time [] tarr = new time[t];
        for(int i = 0; i < t; i++) {
            tarr[i] = new time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Collections.sort(Arrays.asList(tarr), new Comparator<time>() {
            @Override
            public int compare(time o1, time o2) {
                if(o1.bigger(o2)) return 1;
                else if(o2.bigger(o1)) return -1;
                else return 0;
            }
        });

        for(time i : tarr) {
            System.out.println(i);
        }
        
        sc.close();
    }
}