import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bt3 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            List<String> arr = new ArrayList<>();
            List<String> res = new ArrayList<>();
            int count = 0;
            boolean check = false;
            res.add("44");
            res.add("55");
            while(!check) {
                for(int i = 0; i < res.size(); i++) {
                    if(count == n) {
                        check = true;
                        break;
                    }
                    System.out.print(res.get(i) + " ");
                    count ++;
                }
                for(int i = 0; i< res.size(); i++) {
                    arr.add("4" +res.get(i) + "4");
                }
                for(int i = 0; i< res.size(); i++) {
                    arr.add("5" +res.get(i) + "5");
                }
                res.clear();
                res.addAll(arr);
                arr.clear();
            }
            System.out.println();
        }
    }
}
