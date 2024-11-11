import java.util.Scanner;
import java.util.TreeSet;


class WordSet {
    private TreeSet<String> wordset;

    public WordSet(String inputString) {
        setWordSet(inputString.toLowerCase().split(" "));
    }

    public TreeSet<String> getWordset() {
        return wordset;
    }
    
    public void setWordSet(String [] wordSet) {
        TreeSet<String> set = new TreeSet<>();
        for(int i = 0; i < wordSet.length; i++) {
            set.add(wordSet[i]);
        }
        this.wordset = set;
    }

    public WordSet intersection(WordSet s2) {
        TreeSet<String> ws = new TreeSet<>(wordset);
        ws.retainAll(s2.wordset);
        String s = "";
        for(String st : ws) {
            s += st + " ";
        }
        return new WordSet(s);
    }

    public WordSet union(WordSet s2) {
        TreeSet<String> ws = new TreeSet<>(wordset);
        ws.addAll(s2.wordset);
        String str = "";
        for(String w: ws) {
            str += w + " ";
        }
        return new WordSet(str);
    }

    @Override
    public String toString() {
        String res = "";
        for(String s : wordset) {
            res += s + " ";
        }
        return res;
    }
}

public class j04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
