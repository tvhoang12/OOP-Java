import java.util.Scanner;

public class j02013 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        byte t = sc.nextByte();
        int [] arr = new int[t];
        for(int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < t; i++) {
            boolean check = true;
            for(int j = 0; j < t - 1; j ++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    check = false;
                }
            }

            if(check) break;
            
            System.out.printf("Buoc %d: ", i + 1);
            for (int z = 0; z < t; z ++) {
                System.out.print(arr[z] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
