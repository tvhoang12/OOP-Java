import java.util.Scanner;

public class J08029 {
    public static int[] di = {-2, -1, 1, 2, 2, 1, -1, -2};
    public static int[] dj = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void solveLocation(String s) {
        s = (s.charAt(0) - 'a' + 1) + s.substring(1);
    }

    public static boolean isValidMove(int [] board, int row, int col, int n) {
        if(row < 0 || row >= 8 || col < 0 || col >= 8) return false;
        return true;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t --> 0) {
            String start = sc.next(), end = sc.next();
            solveLocation(start);
            solveLocation(end);
            int [][]board = new int[8][8];
        }
    }
}
