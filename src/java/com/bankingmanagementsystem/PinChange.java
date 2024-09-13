package src.java.com.bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener{
    JButton change,back;
    JPasswordField pin,repin;
    String pinnumber;
    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atmImage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.cyan);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250, 280, 400, 35);
        image.add(text);


        JLabel pinText = new JLabel("New PIN:");
        pinText.setFont(new Font("Raleway", Font.BOLD, 14));
        pinText.setForeground(Color.cyan);
        pinText.setBounds(170, 330, 100, 30);
        image.add(pinText);

        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBackground(Color.cyan);
        pin.setBounds(330, 330, 180, 25);
        image.add(pin);


        JLabel repintext = new JLabel("Re-Enter New PIN:");
        repintext.setFont(new Font("Raleway", Font.BOLD, 14));
        repintext.setForeground(Color.cyan);
        repintext.setBounds(170, 360, 150, 30);
        image.add(repintext);

        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBackground(Color.cyan);
        repin.setBounds(330, 360, 180, 25);
        image.add(repin);


        change = new JButton("Change");
        change.setFont(new Font("Raleway", Font.BOLD, 18));
        change.setBackground(Color.cyan);
        change.setForeground(Color.black);
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);



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
        if(ae.getSource() == change) {
            try {
                String npin = pin.getText();
                String rpin = repin.getText();
                if(!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered pin does not match");
                    return;
                }

                if(npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter new pin");
                }
                if(rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please re-enter new pin");
                }

                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+rpin+"' where pin ='"+pinnumber+"'";
                String query2 = "update login set pin_number = '"+rpin+"' where pin_number='"+pinnumber+"'";
                String query3 = "update signupthree set pin_number = '"+rpin+"' where pin_number='"+pinnumber+"'";
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, "PIN Changed successfully");

                setVisible(false);
                new Transactions(rpin).setVisible(true);

            }catch(Exception e) {
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
