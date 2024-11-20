
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class j07015 {
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
    public static void main(String [] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : list) { 
            if(isPrime(i)) {
                if(map.containsKey(i)) map.put(i, map.get(i) + 1);
                else map.put(i, 1);
            }
        }
        list = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet) {
            list.add(entry.getKey());
        }
        for(int i = list.size() - 1; i >= list.size() - 10; i--) {
            System.out.println(list.get(i) + " " + map.get(list.get(i)));
        }
    }
}
