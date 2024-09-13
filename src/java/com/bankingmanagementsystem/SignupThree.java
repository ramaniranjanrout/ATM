package src.java.com.bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton saving,current,fixed,recurring;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignupThree(String formno) {
        this.formno = formno;
        setLayout(null);


        JLabel l1 = new JLabel("Page: 3 Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(290, 80, 400, 30);
        add(l1);


        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBackground(Color.white);
        type.setBounds(100, 140, 200, 30);
        add(type);


        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway", Font.BOLD, 16));
        saving.setBackground(Color.white);
        saving.setBounds(100, 180, 200, 30);
        add(saving);

        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBackground(Color.white);
        current.setBounds(100, 220, 200, 30);
        add(current);


        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setFont(new Font("Raleway", Font.BOLD, 16));
        fixed.setBackground(Color.white);
        fixed.setBounds(320, 180, 200, 30);
        add(fixed);

        recurring = new JRadioButton("Recurring Account");
        recurring.setFont(new Font("Raleway", Font.BOLD, 16));
        recurring.setBackground(Color.white);
        recurring.setBounds(320, 220, 200, 30);
        add(recurring);

        ButtonGroup b = new ButtonGroup();
        b.add(saving);
        b.add(current);
        b.add(fixed);
        b.add(recurring);


        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBackground(Color.white);
        card.setBounds(100, 300, 200, 30);
        add(card);


        JLabel number = new JLabel("XXXX-XXXX-XXXX-2441");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBackground(Color.white);
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBackground(Color.white);
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);



        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBackground(Color.white);
        pin.setBounds(100, 370, 200, 30);
        add(pin);


        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBackground(Color.white);
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);



        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBackground(Color.white);
        pnumber.setBounds(330, 370, 200, 30);
        add(pnumber);



        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBackground(Color.white);
        services.setBounds(100, 450, 200, 30);
        add(services);


        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBackground(Color.white);
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBackground(Color.white);
        c2.setBounds(320, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBackground(Color.white);
        c3.setBounds(100, 540, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alert");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBackground(Color.white);
        c4.setBounds(320, 540 , 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBackground(Color.white);
        c5.setBounds(100, 580, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBackground(Color.white);
        c6.setBounds(320, 580, 200, 30);
        add(c6);


        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway", Font.BOLD, 14));
        c7.setBackground(Color.white);
        c7.setBounds(100, 640, 650, 30);
        add(c7);


        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setBounds(230, 700, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.setBounds(430, 700, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        

        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setVisible(true);
        setLocation(350, 10);
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit) {
            String accountType = null;
            if(saving.isSelected()) {
                accountType = "Saving Account";
            } else if(current.isSelected()) {
                accountType = "Current Account";
            } else if(fixed.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if(recurring.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L )+ 5040936000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L )+ 1000L);
            String facility = "";
            if(c1.isSelected()) {
                facility = facility + " ATM Card";
            } else if(c2.isSelected()) {
                facility = facility + " Internet Banking";
            } else if(c3.isSelected()) {
                facility = facility + " Mobile Banking";
            } else if(c4.isSelected()) {
                facility = facility + " Email & SMS Alert";
            } else if(c5.isSelected()) {
                facility = facility + " Cheque Book";
            } else if(c6.isSelected()) {
                facility = facility + " E-Statement";
            } 
            try {
                if(accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupThree values('" + formno + "' ,'"+accountType+"' ,'"+cardnumber+"' ,'"+pinnumber+"' ,'"+facility+"')";
                    String query2 = "insert into login values('"+formno+"' , '"+cardnumber+"' , '"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        } else if(ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new SignupThree("");
    }
}
