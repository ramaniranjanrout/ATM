package src.java.com.bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {
    MiniStatement(String pinnumber) {
        setLayout(null);
        setTitle("Mini Statement");

        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);

        JLabel bankName = new JLabel("State Bank of India");
        bankName.setFont(new Font("Raleway", Font.BOLD, 18));
        bankName.setBounds(110, 20, 200, 30);
        add(bankName);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin_number = '" + pinnumber + "'");
            while (rs.next()) {
                card.setText("Card Number: " + rs.getString("card_number").substring(0, 4) + "XXXXXXXX"
                        + rs.getString("card_number").substring(12));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Conn c = new Conn();
            int bal = 0;
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");
            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + rs.getString("amount") + "<br><br><br>");
                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your account balance is Rs " + bal);

        } catch (Exception e) {
            System.out.println(e);
        }

        setSize(400, 600);
        setLocation(500, 120);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
