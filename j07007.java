import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class j07007 {
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> words = new TreeSet<>();
        while(sc.hasNext()) {
            words.add(sc.next().toLowerCase());
        }
        for(String w : words) {
            System.out.println(w);
        }
        sc.close();
    }
}
