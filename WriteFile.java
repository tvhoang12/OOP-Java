import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(939 );
        list.add(22643);
        list.add(11311 );
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(35);
        list.add(53);
        list.add(13);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(79);
        list.add(22);
        list.add(31);
        list.add(55);
        list.add(17);
        list.add(23);
        list.add(351);
        list.add(535);
        list.add(137);
        // Add more integers as needed...

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        out.writeObject(list);
        out.close();
    }
}
