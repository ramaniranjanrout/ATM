package src.java.com.bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    JButton rs100,rs500,re1000,rs2000,rs5000,rs10000,back;
    String pinnumber;
    FastCash(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atmImage.jpg"));
        Image i2  = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.cyan);
        text.setBounds(220, 300, 700, 35);
        image.add(text);


        rs100 = new JButton("Rs 100");
        rs100.setFont(new Font("Raleway", Font.BOLD, 14));
        rs100.setBounds(170, 415, 150, 30);
        rs100.setBackground(Color.cyan);
        rs100.setForeground(Color.black);
        rs100.addActionListener(this);
        image.add(rs100);


        rs500 = new JButton("Rs 500");
        rs500.setFont(new Font("Raleway", Font.BOLD, 14));
        rs500.setBounds(355, 415, 150, 30);
        rs500.setBackground(Color.cyan);
        rs500.setForeground(Color.black);
        rs500.addActionListener(this);
        image.add(rs500);


        re1000 = new JButton("Rs 1000");
        re1000.setFont(new Font("Raleway", Font.BOLD, 14));
        re1000.setBounds(170, 450, 150, 30);
        re1000.setBackground(Color.cyan);
        re1000.setForeground(Color.black);
        re1000.addActionListener(this);
        image.add(re1000);


        rs2000 = new JButton("Rs 2000");
        rs2000.setFont(new Font("Raleway", Font.BOLD, 14));
        rs2000.setBounds(355, 450, 150, 30);
        rs2000.setBackground(Color.cyan);
        rs2000.setForeground(Color.black);
        rs2000.addActionListener(this);
        image.add(rs2000);


        rs5000 = new JButton("Rs 5000");
        rs5000.setFont(new Font("Raleway", Font.BOLD, 14));
        rs5000.setBounds(170, 485, 150, 30);
        rs5000.setBackground(Color.cyan);
        rs5000.setForeground(Color.black);
        rs5000.addActionListener(this);
        image.add(rs5000);


        rs10000 = new JButton("Rs 10000");
        rs10000.setFont(new Font("Raleway", Font.BOLD, 14));
        rs10000.setBounds(355, 485, 150, 30);
        rs10000.setBackground(Color.cyan);
        rs10000.setForeground(Color.black);
        rs10000.addActionListener(this);
        image.add(rs10000);


        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 14));
        back.setBounds(355, 520, 150, 30);
        back.setBackground(Color.cyan);
        back.setForeground(Color.black);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back) {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton) ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()) {
                    if(rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, " Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);

            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        new FastCash("");
    }
}
