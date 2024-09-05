
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class j02007 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q = 0; q < t; q++) {
            int n = sc.nextInt();
            int a [] = new int[n];
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (map.containsKey(a[i])) {
                    map.put(a[i], map.get(a[i]) + 1);
                }
                else {
                    map.put(a[i], 1);
                }
            }
            System.out.println("Test " + (q + 1) + ":");
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " xuat hien " +entry.getValue() + " lan");
            }
        }
        sc.close();
    }
}