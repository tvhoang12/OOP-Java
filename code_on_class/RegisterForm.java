package code_on_class; // Thêm dòng này ở đầu tệp để chỉ định package

import javax.swing.*;
import java.awt.*;

public class RegisterForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("New User Register");
        frame.setSize(400, 300);
        frame.setLayout(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2, 10, 10));

        panel.add(new JLabel("First Name"));
        panel.add(new TextField());

        panel.add(new JLabel("Last Name"));
        panel.add(new TextField());

        panel.add(new JLabel("Email Address"));
        panel.add(new TextField());

        panel.add(new JLabel("Mobile Number"));
        panel.add(new TextField());

        panel.add(new JLabel("Username"));
        panel.add(new TextField());

        panel.add(new JLabel("Password"));
        panel.add(new TextField());

        frame.add(panel);
        
        frame.setVisible(true);

    }
}
