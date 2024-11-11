import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Gamer {
    private String id, hoten;
    private int minutes;

    public Gamer() {}
    public Gamer(String id, String hoten, int minutes) {
        this.id = id;
        this.hoten = hoten;
        this.minutes = minutes;
    }

    public boolean isBigger(Gamer g2) {
        return minutes > g2.minutes;
    }
    public void setID(String id) {
        this.id = id;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void setMinutes(int time) {
        this.minutes =  time;
    }

    @Override
    public String toString() {
        int gio = (int) minutes / 60;
        int phut = (int) minutes - gio * 60;
        return String.format("%s %s %d gio %d phut", id, hoten, gio, phut);
    }
}

public class j05011 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Gamer> gamerList = new ArrayList<>();
        sc.nextLine();
        for(int i = 0; i < t; i++) {
            Gamer tempGamer = new Gamer();
            tempGamer.setID(sc.nextLine());
            tempGamer.setHoten(sc.nextLine());
            String inTime = sc.nextLine();
            String outTime = sc.nextLine();
            int time = (Integer.parseInt(outTime.substring(0, 2)) * 60 
                        + Integer.parseInt(outTime.substring(3, 5)))
                        -(Integer.parseInt(inTime.substring(0, 2)) * 60
                        + Integer.parseInt(inTime.substring(3, 5)));
            // System.out.println(time);
            tempGamer.setMinutes(time);
            gamerList.add(tempGamer);
        }

        Collections.sort(gamerList, new Comparator<Gamer>() {
            @Override
            public int compare(Gamer g1, Gamer g2) {
                if(g1.isBigger(g2)) return -1;
                else if(g2.isBigger(g1)) return 1;
                else return 0;
            }
        });

        for(Gamer e : gamerList) {
            System.out.println(e);
        }
        sc.close();
    }
}