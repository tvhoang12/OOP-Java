import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class j08015 { 
    

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int [] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(map.get(arr[i]) == null) {
                    map.put(arr[i], 1);
                }
                else map.put(arr[i], map.get(arr[i]) + 1);
            }
            int count = 0;
            for(int i = 0; i < n; i++) {
                if(map.get(k - arr[i]) != null) {
                    count += map.get(k - arr[i]);
                }
                if(k - arr[i] == arr[i]) {
                    count -= 1;
                }
            }

            System.out.println(count / 2);
            
        }
        
    }   
    
}
