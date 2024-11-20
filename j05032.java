import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Man {
    private String name;
    private int [] birthDate = new int[3];
    public Man(){}
    public Man(String name, String birthDate) {
        this.name = name;
        setBirthdate(birthDate);
    }

    public String getName() {
        return name;
    }
    public String getBirthDate() {
        return String.format("%d/%d/%d", birthDate);
    }

    public void setBirthdate(String birthDate) {
        String [] bdNumbers = birthDate.split("/");
        int j = 0;
        for(int i = 0; i < bdNumbers.length; i++) { 
            if(bdNumbers[i] != "/") {
                this.birthDate[j] = Integer.parseInt(bdNumbers[i]);
                j += 1;
            }
        }
    }

    public boolean compare(Man m2) {
        int i = 2;
        while(i >= 0) {
            if(birthDate[i] < m2.birthDate[i]) return true;
            else if (birthDate[i] == m2.birthDate[i]) i--;
            else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
public class j05032 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Man> mans = new ArrayList<>();
        Man oldestMan = new Man(), youngesMan = new Man();
        while(t --> 0) {
            mans.add(new Man(sc.next(), sc.next()));
        }
        oldestMan = mans.get(0);
        youngesMan = mans.getFirst();
        for(int i = 0; i < mans.size(); i++) {
            if(!oldestMan.compare(mans.get(i))) {
                oldestMan = mans.get(i);
            }
            if(youngesMan.compare(mans.get(i))){
                youngesMan = mans.get(i);
            }
        }

        System.out.println(youngesMan.getName() + "\n" + oldestMan.getName());
    }
}
