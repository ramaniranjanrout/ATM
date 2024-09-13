package src.java.com.bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    String pinnumber;
    JTextField amount;
    JButton withdraw,back;
    Withdrawl(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atmimage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);


        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setForeground(Color.cyan);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(195,300,400,20);
        image.add(text);



        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBackground(Color.cyan);
        amount.setBounds(195, 350, 285, 30);
        image.add(amount);



        withdraw = new JButton("Withdraw");
        withdraw.setFont(new Font("Raleway", Font.BOLD, 18));
        withdraw.setBackground(Color.cyan);
        withdraw.setForeground(Color.black);
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);



        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 18));
        back.setBackground(Color.cyan);
        back.setForeground(Color.black);
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);


        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == withdraw) {
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to Withdraw");
            } else {
                try{
                    Conn conn = new Conn();
                    String queary = "insert into bank values('"+pinnumber+"','"+date+"' ,'Withdrawl'  ,'"+number+"')";
                    conn.s.executeUpdate(queary);
                    JOptionPane.showMessageDialog(null, "Rs "+number+" Withdraw Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);

                } catch(Exception e) {
                    System.out.println(e);
                }
            }

        } else if(ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Withdrawl("");
    }
}
