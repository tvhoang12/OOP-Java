import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class j03009 {
    public static void main(String [] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t --> 0) {
            Set<String> st1 = new HashSet<>();
            String s = sc.nextLine();
            String[] arr1 = s.split(" "); // split trả về mảng String[]
            st1.addAll(Arrays.asList(arr1)); // Thêm tất cả phần tử từ mảng vào Set

            String s2 = sc.nextLine();
            Set<String> st2 = new HashSet<>();
            String[] arr2 = s2.split(" ");
            st2.addAll(Arrays.asList(arr2)); // Thêm tất cả phần tử từ mảng vào Set

            for(String i : st1) {
                if(!st2.contains(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
