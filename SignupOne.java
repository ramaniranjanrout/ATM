package src.java.com.bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameText ,fnameText, emailText, addressText, cityText, stateText, pincodeText;
    JButton next;
    JRadioButton male, female, other1, married, unmarried, other2;
    JDateChooser dateChooser;

    SignupOne() {
        setLayout(null);


        Random r = new Random();
        random = Math.abs((r.nextLong() % 9000L) + 1000L);


        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);


        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);


        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);


        nameText = new JTextField();
        nameText.setFont(new Font("Raleway", Font.BOLD, 14));
        nameText.setBounds(300, 140, 400, 30);
        add(nameText);


        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);


        fnameText = new JTextField();
        fnameText.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameText.setBounds(300, 190, 400, 30);
        add(fnameText);



        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);


        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);


        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 14));
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);


        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        female.setBounds(425, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);

        other1 = new JRadioButton("Other");
        other1.setFont(new Font("Raleway", Font.BOLD, 14));
        other1.setBounds(550, 290, 120, 30);
        other1.setBackground(Color.white);
        add(other1);


        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other1);



        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);


        emailText = new JTextField();
        emailText.setFont(new Font("Raleway", Font.BOLD, 14));
        emailText.setBounds(300, 340, 400, 30);
        add(emailText);



        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);


        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 14));
        married.setBounds(300, 390, 120, 30);
        married.setBackground(Color.white);
        add(married);


        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway", Font.BOLD, 14));
        unmarried.setBounds(425, 390, 120, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);


        other2 = new JRadioButton("Other");
        other2.setFont(new Font("Raleway", Font.BOLD, 14));
        other2.setBounds(550, 390, 120, 30);
        other2.setBackground(Color.white);
        add(other2);


        ButtonGroup statusgroup = new ButtonGroup();
        statusgroup.add(married);
        statusgroup.add(unmarried);
        statusgroup.add(other2);


        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);


        addressText = new JTextField();
        addressText.setFont(new Font("Raleway", Font.BOLD, 14));
        addressText.setBounds(300, 440, 400, 30);
        add(addressText);



        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);


        cityText = new JTextField();
        cityText.setFont(new Font("Raleway", Font.BOLD, 14));
        cityText.setBounds(300, 490, 400, 30);
        add(cityText);


        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);


        stateText = new JTextField();
        stateText.setFont(new Font("Raleway", Font.BOLD, 14));
        stateText.setBounds(300, 540, 400, 30);
        add(stateText);


        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);


        pincodeText = new JTextField();
        pincodeText.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeText.setBounds(300, 590, 400, 30);
        add(pincodeText);


        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setVisible(true);
        setLocation(350, 10);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameText.getText();
        String fname = fnameText.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if(female.isSelected()) {
            gender = "Female";
        } else if(other1.isSelected()) {
            gender = "Other";
        }
        String email = emailText.getText();
        String marital = null;
        if(married.isSelected()) {
            marital = "Married";
        } else if(unmarried.isSelected()) {
            marital = "Unmarried";
        } else if(other2.isSelected()) {
            marital = "Other";
        }
        String address = addressText.getText();
        String city = cityText.getText();
        String state = stateText.getText();
        String pincode = pincodeText.getText();


        try {
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else if(fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's name is required");
            } else if(dob.equals("")) {
                JOptionPane.showMessageDialog(null,"Date of Birth is required");
            } else if(email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email Id is required");
            } else if(address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address is required");
            } else if(city.equals("")) {
                JOptionPane.showMessageDialog(null, "City is required");
            } else if(state.equals("")) {
                JOptionPane.showMessageDialog(null, "State is required");
            } else if(pincode.equals("")) {
                JOptionPane.showMessageDialog(null, "Pin code is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"','"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"' , '"+state+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }


        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
