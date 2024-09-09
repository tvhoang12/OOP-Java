import java.util.Scanner;

public class j02010 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextByte();
        int [] arr = new int[t];
        
        for(int i = 0; i < t; i ++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;

        for(int i = 0; i < t - 1; i++) {
            //tim phan tu be hon ptu hien tai roi doi cho
            for(int j = i + 1; j < t; j++) {
                if(arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } 
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int z = 0; z < t; z ++) {
                System.out.print(arr[z] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
