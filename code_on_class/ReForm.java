package code_on_class;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

import javax.swing.*;

public class ReForm {

    public static void register_Frame() {
        // Create the registration frame
        JFrame registerFrame = new JFrame("New User Register");
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerFrame.setSize(400, 300);
        registerFrame.setLayout(new GridLayout(2,1, 10, 10));

        JPanel textFieldJPanel = new JPanel();
        textFieldJPanel.setLayout(new GridLayout(3, 4, 10, 30));
        textFieldJPanel.setBounds(0,0, 350, 200);

        JTextField firstname = new JTextField(20);
        JTextField lastname = new JTextField(20);
        JTextField username = new JTextField(20);
        JTextField password = new JTextField(20);
        JTextField email = new JTextField(20);
        JTextField mobilePhone = new JTextField(20);

        // Add components to the registration frame
        textFieldJPanel.add(new JLabel("First name:"));
        textFieldJPanel.add(firstname);

        textFieldJPanel.add(new JLabel("Last name:"));
        textFieldJPanel.add(lastname);

        textFieldJPanel.add(new JLabel("Username:"));
        textFieldJPanel.add(username);

        textFieldJPanel.add(new JLabel("Password:"));
        textFieldJPanel.add(password);

        textFieldJPanel.add(new JLabel("Email Address:"));
        textFieldJPanel.add(email);

        textFieldJPanel.add(new JLabel("Mobile number:"));
        textFieldJPanel.add(mobilePhone);
        

        JPanel buttonPanel = new JPanel();
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Register the user
                String firstn = firstname.getText();
                String lastn = lastname.getText();
                String usern = username.getText();
                String pass = password.getText();
                String em = email.getText();
                String mobile = mobilePhone.getText();
                try {
                    register(firstn, lastn, usern, pass, em, mobile);
                } catch (FileNotFoundException e1) {
                }
            }
        });
        buttonPanel.add(registerButton);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPage();
            }
        });
        buttonPanel.add(loginButton);

        registerFrame.add(textFieldJPanel);
        registerFrame.add(buttonPanel);
        // Show the registration frame
        registerFrame.setVisible(true);
    }

    public static void loginPage() {
        JFrame frame = new JFrame("Login Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(2,1, 10, 10));

        JPanel textFieldJPanel = new JPanel();
        textFieldJPanel.setLayout(new GridLayout(3, 4, 10, 30));
        textFieldJPanel.setBounds(0,0, 350, 200);

        JTextField username = new JTextField(20);
        JTextField password = new JTextField(20);

        textFieldJPanel.add(new JLabel("Username:"));
        textFieldJPanel.add(username);

        textFieldJPanel.add(new JLabel("Password:"));
        textFieldJPanel.add(password);

        JPanel buttonPanel = new JPanel();
        JButton loginButton = new JButton("Login");
        buttonPanel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Login the user
                System.out.println("Login button clicked!");
                String usern = username.getText();
                String pass = password.getText();
                if(checkLogin(usern, pass)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed!");
                }
            }
        });

        frame.add(textFieldJPanel);
        frame.add(buttonPanel);
        frame.setVisible(true);
    }

    public static void register(String firstname, String lastname, String username, String password, String email, String mobilePhone) throws FileNotFoundException {
        // Register the user in information.txt file which use to store user information
        try{
            if(checkUser(username)) {
                // Write the user information to the file
                File file = new File("information.txt");
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(firstname + " " + lastname + " " + username + " " + password + " " + email + " " + mobilePhone);
                bw.newLine();
                bw.close();
                fw.close();
                System.out.println("User registered successfully!");
                System.out.println("User information: ");
                System.out.println("First name: " + firstname);
                System.out.println("Last name: " + lastname);
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("Email: " + email);
                System.out.println("Mobile number: " + mobilePhone);
            } else {
                System.out.println("User already exists!");
            }
        }catch(IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static boolean checkUser(String username) {
        // Check if the user already exists in the file
        try {
            File file = new File("information.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split(" ");
                if(words[2].equals(username)) {
                    return false;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return true;
    }

    public static boolean checkLogin(String username, String password) {
        // Check if the user exists in the file
        try {
            if(checkUser(username)) {
                return false;
            } else {
                File file = new File("information.txt");
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] words = line.split(" ");
                    if(words[3].equals(password)) {
                        return true;
                    }
                }
                sc.close();
            }
        }
        catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        register_Frame();
    }

}
