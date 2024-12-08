import java.util.ArrayList;
import java.util.Scanner;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        int pointer = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '>' && pointer < str.length()) {
                pointer += 1;
            }
            else if(c == '<' && pointer >= 0) {
                if(pointer == 0) pointer = 0;
                else pointer -= 1;
            }
            else if(c == '-') {
                res = res.substring(0, pointer - 1) + res.substring( pointer);
            }
            else {
                res = res.substring(0, pointer) + c + res.substring(pointer);
            }
        }

        System.out.println(res);
         
        sc.close();
    }
}
