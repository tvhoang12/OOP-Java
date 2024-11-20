package code_on_class;
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, 10px horizontal and vertical gaps

        // Add components to the panel
        panel.add(new JLabel("Label 1:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Label 2:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Label 3:"));
        panel.add(new JTextField());

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
