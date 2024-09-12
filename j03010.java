import java.util.*;
public class j03010 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> mySet = new ArrayList<>();
        while (t-- > 0)
        {
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            int n = a.length;

            String email = a[n - 1];

            for(int i = 0; i < n - 1; i++) {
                String z = a[i];
                email += z.charAt(0);
            }
            mySet.add(email);
            int count = Collections.frequency(mySet, email);
            System.out.println(email + (count == 1 ? "" : count) + "@ptit.edu.vn");
        }

        
        sc.close();
    }
}