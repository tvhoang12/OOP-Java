// j04021 - LỚP INTSET
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class IntSet {
    private TreeSet<Integer> arr;

    public IntSet(int [] arr) {
        setArr(arr);
    }

    public TreeSet<Integer> getArr() {
        return arr;
    }

    public void setArr(int [] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int e : arr) set.add(e);
        this.arr = set;
    }

    public IntSet intersection(IntSet s2) {
        TreeSet<Integer> set = new TreeSet<>(arr);

        set.retainAll(s2.arr);
        int [] a = new int[set.size()];
        int i = 0;
        for(int e : set) {
            a[i] = e;
            i ++;
        }
        return new IntSet(a);
    }

    @Override
    public String toString() {
        String res = "";
        for(int i : arr) {
            res += i + " ";
        }
        return res;
    }
}

public class j04021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
