import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class j07004 {
    public static void main(String [] args) {
        
        try {
            FileInputStream ip = new FileInputStream("DATA.in");
            DataInputStream dp = new DataInputStream(ip);
            int [] a = new int [1000];
            for(int i = 0; i < 100000; i++) {
                a[dp.readInt()] ++;
            }
            for(int i = 0; i < 1000; i++) {
                if(a[i] > 0) System.out.println(i + " " + a[i]);
            }
        }
        catch(IOException e) {
            System.out.println(e);
        }   
    }
}
