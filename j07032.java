import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class j07032 {
    public static boolean KtraTN(int num) {
        String check = Integer.toString(num);
        int i = 0, j = check.length() - 1;
        while(i < j) {
            if(check.charAt(i) != check.charAt(j)) return false;
            i ++;
            j --;
        }

        while(num > 0) {
            if((num % 10) % 2 == 0) return false;
            num /= 10;
        }

        return check.length() % 2 == 1 && check.length() > 1;
        
    }
    
    public static void main(String [] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> data1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> data2 = (ArrayList<Integer>) in2.readObject();
        int [] map = new int[1000000];
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele : data1) {
            if(KtraTN(ele)) {
                map[ele] += 1;
            }
        }
        for(int ele : data2) {
            if(map[ele] != 0) {
                map[ele] += 1;
                set.add(ele);
            }
        }
        int count = 0;
        for(int e : set) {
            if(count < 10) {
                System.out.println(e + " " + map[e]);
                count += 1;
            }
        }
    }
}
