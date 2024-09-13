package src.java.com.bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atmImage.jpg"));
        Image i2  = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.cyan);
        text.setBounds(220, 300, 700, 35);
        image.add(text);


        deposit = new JButton("Deposit");
        deposit.setFont(new Font("Raleway", Font.BOLD, 14));
        deposit.setBounds(170, 415, 150, 30);
        deposit.setBackground(Color.cyan);
        deposit.setForeground(Color.black);
        deposit.addActionListener(this);
        image.add(deposit);


        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setFont(new Font("Raleway", Font.BOLD, 14));
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.setBackground(Color.cyan);
        withdrawl.setForeground(Color.black);
        withdrawl.addActionListener(this);
        image.add(withdrawl);


        fastcash = new JButton("Fast Cash");
        fastcash.setFont(new Font("Raleway", Font.BOLD, 14));
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.setBackground(Color.cyan);
        fastcash.setForeground(Color.black);
        fastcash.addActionListener(this);
        image.add(fastcash);


        ministatement = new JButton("Min Statement");
        ministatement.setFont(new Font("Raleway", Font.BOLD, 14));
        ministatement.setBounds(355, 450, 150, 30);
        ministatement.setBackground(Color.cyan);
        ministatement.setForeground(Color.black);
        ministatement.addActionListener(this);
        image.add(ministatement);


        pinchange = new JButton("Pin Change");
        pinchange.setFont(new Font("Raleway", Font.BOLD, 14));
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.setBackground(Color.cyan);
        pinchange.setForeground(Color.black);
        pinchange.addActionListener(this);
        image.add(pinchange);


        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setFont(new Font("Raleway", Font.BOLD, 14));
        balanceenquiry.setBounds(355, 485, 150, 30);
        balanceenquiry.setBackground(Color.cyan);
        balanceenquiry.setForeground(Color.black);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);


        exit = new JButton("Exit");
        exit.setFont(new Font("Raleway", Font.BOLD, 14));
        exit.setBounds(355, 520, 150, 30);
        exit.setBackground(Color.cyan);
        exit.setForeground(Color.black);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit) {
        System.exit(0);
        } else if(ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if(ae.getSource() == withdrawl) {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if(ae.getSource() == fastcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if(ae.getSource() == pinchange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        } else if(ae.getSource() == balanceenquiry) {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        } else if(ae.getSource() == ministatement) {
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Transactions("");
    }
}
