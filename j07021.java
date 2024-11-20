import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class j07021 {
    public static String standardlization(String name) {
        String [] words = name.split("\\s+");
        name = "";
        for(int i = 0; i < words.length; i++) {
            if(!words[i].isEmpty()) words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
        }
        for(int i = 0; i < words.length; i++) {
            name += words[i] + " ";
        }
        return name;
    }
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true) {
            String str = sc.nextLine();
            if(str.equals("END")) {
                break;
            }
            else {
                System.out.println(standardlization(str));
            }
        }
        sc.close();
    }
}
