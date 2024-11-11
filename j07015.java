
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;

public class j07015 {
    public static void sieve(List<Integer> arr) {
        int n = 100000;
        for(int i = 0; i < n; i++) {
            arr.add(1);
        }
        arr.set(1, 0);
        arr.set(1, 0);
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(arr.get(i) == 1) {
                for(int j = i * i; j < n; j += i) {
                    arr.set(j, 0);
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args) throws Exception {
        List<Integer> arr = new ArrayList<>();
        sieve(arr);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        ArrayList<Integer> b = new ArrayList<>();
        in.close();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.size(); i++) {
            int k = a.get(i);
            b.add(k);
            if(isPrime(k)) {
                if(map.containsKey(k)) {
                    map.put(k, map.get(k) + 1);
                } else {
                    map.put(k, 1);
                }
            }
        }
        Collections.sort(b);
        for(int i : b) {
            System.out.print(i + " " + map.get(i) + "\n");
        }
    }
}
