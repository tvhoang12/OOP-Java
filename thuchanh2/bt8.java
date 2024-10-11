import java.util.Scanner;

public class bt8 {
    class User {
        private String name, password;

        User() {
        }
        public User(String name, String password) {
            this.name = name;
            this.password = password;
        }
        public String getName() {
            return name;
        }
        public String getPassword() {
            return password;
        }

        public boolean equals(User b) {
            return this.name.equals(b.name) && this.password.equals(b.password);
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        User [] arr = new User[t];
        for(int i = 0; i < t; i++) {
            String name = sc.next();
            String password = sc.next();
            arr[i] = new bt8().new User(name, password);
        }
        int[] res = new int[t];
        for(int i = 0; i < t; i++) {
            res[i] = 0;
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String name = sc.next();
            String password = sc.next();
            for(int j = 0; j < t; j++) {
                if(arr[j].equals(new bt8().new User(name, password))) {
                    res[j] += 1;
                    break;
                }
            }
        }
        for(int i = 0; i < t; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
