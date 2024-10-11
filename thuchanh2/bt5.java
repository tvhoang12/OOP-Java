import java.util.Scanner;

public class bt5 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        float [] arr = new float[t];
        for(int i = 0; i < t; i++) {
            arr[i] = sc.nextFloat();
        }

        float maxi = -1, mini = 11;
        for(int i = 0; i < t; i++) {
            if(maxi < arr[i]) {
                maxi = arr[i];
            }
            if(mini > arr[i]) {
                mini = arr[i];
            }
        }

        float sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != maxi && arr[i] != mini) {
                // System.out.print(arr[i] + " ");
                sum += arr[i];
            }
            else{
                t --;
            }
        }
        // System.out.printf(maxi + " " + mini);
        System.out.printf("%.2f", sum/t);

        sc.close();
    }
}
