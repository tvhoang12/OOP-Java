import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class J08028 {

    public static long maxRectangle(int [] arr, int n) {
        Stack<Integer> st = new Stack<>();

        int [] leftArr = new int[n];
        for(int i = 0; i < n; i++) {
            while(!st.empty() && arr[i] <= arr[st.peek()]) st.pop();
            if(st.empty()) leftArr[i] = 0;
            else leftArr[i] = st.peek() + 1;
            st.add(i);
        }
        
        int [] rightArr = new int[n];
        st = new Stack<>();
        for(int i = n - 1; i >= 0; i--) {
            while(!st.empty() && arr[i] <= arr[st.peek()]) st.pop();
            if (st.empty()) rightArr[i] = n - 1;
            else rightArr[i] = st.peek() - 1;
            st.add(i);
        }

        long res = Long.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            res = Math.max(res, (long) arr[i] * (rightArr[i] - leftArr[i] + 1));
        }

        return res;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] arr2 = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr2[i] = m - arr[i];
        }

        System.out.println(Math.max(maxRectangle(arr2, n), maxRectangle(arr, n)));

        sc.close();
    }
}
