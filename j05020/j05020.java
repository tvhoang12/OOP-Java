package j05020;
public class j05020 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int [][] adj = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }
        String[] res = new String[n];
        for(int i = 0; i < n; i++) {
            res[i] = String.format("List(%d) = ", i + 1);

            for(int j = 0; j < n; j++) {
                if(adj[i][j] == 1) {
                    res[i] += (j+1) + " ";
                }
            }
        }
        for(String s : res) {
            System.out.println(s);
        }
        sc.close();
    }
}