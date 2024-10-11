import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bt9 {
    class Pair {
        int key;
        int value;
        Pair() {}
        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
        public int getKey() {
            return key;
        }
        public int getValue() {
            return value;
        }
        public boolean bigger(Pair b) {
            return this.value > b.value;
        }
    }
    public static boolean increase(String n) {
        for(int i = 0; i < n.length() - 1; i++) {
            if(n.charAt(i) > n.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Pair> arr = new ArrayList<>();

        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            if(increase(Integer.toString(n))) {
                boolean contain = false;
                for(Pair i:arr) {
                    if(i.getKey() == n) {
                        i.value += 1;
                        contain = true;
                        break;
                    }
                }
                if(!contain) {
                    arr.add(new bt9().new Pair(n, 1));
                }
            }
        }

        Collections.sort(arr, (a, b) -> {
            if(a.bigger(b)) {
                return -1;
            } else {
                return 1;
            }
        });

        for(Pair i:arr) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

        sc.close();
    }
}
