package src.java.com.bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JPasswordField;


public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField cardText;
    JPasswordField pinText;
    
    Login() {
        setTitle("Welcome to SBI");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l = new JLabel(i3);
        l.setBounds(70, 10, 100, 100);
        add(l);


        JLabel text = new JLabel("WELCOME TO SBI ATM");
        text.setFont(new Font("Raleway", Font.BOLD, 28));
        text.setForeground(Color.black);
        text.setBounds(200, 40, 450, 30);
        add(text);


        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setForeground(Color.black);
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        cardText = new JTextField();
        cardText.setBounds(300, 150, 230, 30);
        cardText.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardText);


        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setForeground(Color.black);
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        pinText = new JPasswordField();
        pinText.setBounds(300, 220, 230, 30);
        pinText.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinText);


        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);


        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.white);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear) {
            cardText.setText("");
            pinText.setText("");
        }else if(ae.getSource() == login) {
            Conn con = new Conn();
            String cardnumber = cardText.getText();
            String pinnumber = pinText.getText();
            String query = "select * from login where card_number = '"+cardnumber+"' and pin_number = '"+pinnumber+"'";
            try{
                ResultSet rs = con.s.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect pin");
                }

            }catch (Exception e) {
                System.out.println(e);
            }

        } else if(ae.getSource() == signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
