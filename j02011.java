import java.util.Scanner;

public class j02011 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        //khoi tao cac du lieu
        int t = sc.nextByte();
        int [] arr = new int[t];
        for(int i = 0; i < t; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < t - 1; i++) {
            //tim phan tu nho nhat chua dc sap xep
            int min_index = i;
            int temp = 0;
            for(int j = i + 1; j < t; j++) {
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                } 
            }

            //doi cho cac phan tu
            temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

            //in mang ra theo yeu cau
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int z = 0; z < t; z ++) {
                System.out.print(arr[z] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
