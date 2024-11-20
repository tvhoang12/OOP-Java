import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.IOException;

public class j07022 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> set = new ArrayList<>();
        while(sc.hasNext()) {
            String str = sc.next();
            try {
                int number = Integer.parseInt(str);
            } catch(NumberFormatException e) {
                set.add(str);
            }
        }
        Collections.sort(set);
        for(String s:set) {
            System.out.print(s + " ");
        }
        sc.close();
    }
}
