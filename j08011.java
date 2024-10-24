import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class j08011 {
    static class Pair {
        private String first;
        private int  second;
        Pair(String first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static boolean checkTN(String first) {
        for(int i = 0; i < first.length() / 2 + 1; i++) {
            if(first.charAt(i) != first.charAt(first.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Pair> list = new ArrayList<>();
        int maxLength = -1;
        while(sc.hasNext()) {
            String n = sc.next();
            boolean check = false;
            if(checkTN(n)) {
                for(Pair p : list) {
                    if(p.first.equals(n)) {
                        p.second++;
                        maxLength = Math.max(maxLength, p.first.length());
                        check = true;
                        break;
                    }
                }
                if(!check) {
                    list.add(new Pair(n, 1));
                    maxLength = Math.max(maxLength, n.length());
                }
            }
        }
        Collections.sort(list, (a, b) -> {
            return b.first.length() - a.first.length();
        });
        // System.out.println(maxLength);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).first.length() == maxLength) {
                System.out.println(list.get(i).first + " " + list.get(i).second);
            }
            else {
                break;
            }
        }
    }
}
