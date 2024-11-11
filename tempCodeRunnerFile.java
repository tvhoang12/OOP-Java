import java.util.TreeSet;

public class tempCodeRunnerFile {
    public static void main(String [] args) {
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        String [] inputFile = "lap trinh huong doi tuong".split(" ");
        String [] inputFile2 = "c++ ngon ngu lap trinh".split(" ");

        for(String s : inputFile) {
            set1.add(s);
        }
        for(String s : inputFile2) set2.add(s);

        set1.retainAll(set2);
        for(String s : set1) {
            System.out.println(s);
        }
    }
}
