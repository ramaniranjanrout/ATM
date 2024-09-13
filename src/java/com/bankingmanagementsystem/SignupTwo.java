package src.java.com.bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    JComboBox<String>religion, category, occupation, qualification,income;
    JTextField pan,aadhaar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;


        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel nameReligion = new JLabel("Religion:");
        nameReligion.setFont(new Font("Raleway", Font.BOLD, 20));
        nameReligion.setBounds(100, 140, 100, 30);
        add(nameReligion);

        String valReligion[] = {"Select","Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox<>(valReligion);
        religion.setFont(new Font("Raleway", Font.BOLD, 14));
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.white);
        add(religion);


        JLabel nameCategory = new JLabel("Category:");
        nameCategory.setFont(new Font("Raleway", Font.BOLD, 20));
        nameCategory.setBounds(100, 190, 200, 30);
        add(nameCategory);


        String valCategory [] = {"Select","General","OBC", "SEBC", "ST", "SC","Other"};
        category = new JComboBox<>(valCategory);
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.white);
        add(category);


        JLabel annual = new JLabel("Income:");
        annual.setFont(new Font("Raleway", Font.BOLD, 20));
        annual.setBounds(100, 240, 200, 30);
        add(annual);


        String incomeCategory[] = {"Select","0", "< 1,50,000", "< 2,50,000", "< 5,00,000","Upto 10,00,000"};
        income = new JComboBox<>(incomeCategory);
        income.setFont(new Font("Raleway", Font.BOLD, 14));
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
        add(income);


        JLabel degree1 = new JLabel("Educational");
        degree1.setFont(new Font("Raleway", Font.BOLD, 20));
        degree1.setBounds(100, 290, 200, 30);
        add(degree1);

        
        JLabel degree2 = new JLabel("Qualification:");
        degree2.setFont(new Font("Raleway", Font.BOLD, 20));
        degree2.setBounds(100, 315, 200, 30);
        add(degree2);


        String valEducation[] = {"Select","Non-Graduation", "Graduate", "Post-Graduation", "Doctrate","Other"};
        qualification = new JComboBox<>(valEducation);
        qualification.setFont(new Font("Raleway", Font.BOLD, 14));
        qualification.setBounds(300, 310, 400, 30);
        qualification.setBackground(Color.white);
        add(qualification);



        JLabel salary = new JLabel("Occupation:");
        salary.setFont(new Font("Raleway", Font.BOLD, 20));
        salary.setBounds(100, 390, 200, 30);
        add(salary);


        String valOccupation[] = {"Select","Salaried", "Self-Employed", "Bussiness","Student","Retired","Other"};
        occupation = new JComboBox<>(valOccupation);
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.white);
        add(occupation);


        JLabel panNo = new JLabel("PAN Number:");
        panNo.setFont(new Font("Raleway", Font.BOLD, 20));
        panNo.setBounds(100, 440, 200, 30);
        add(panNo);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel aadhaarNo = new JLabel("Aadhaar Number:");
        aadhaarNo.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhaarNo.setBounds(100, 490, 200, 30);
        add(aadhaarNo);

        aadhaar= new JTextField();
        aadhaar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhaar.setBounds(300, 490, 400, 30);
        add(aadhaar);

        JLabel age = new JLabel("Senior citizen:");
        age.setFont(new Font("Raleway", Font.BOLD, 20));
        age.setBounds(100, 540, 200, 30);
        add(age);

        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway", Font.BOLD, 14));
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.white);
        add(syes);

        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD, 14));
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.white);
        add(sno);

        ButtonGroup c = new ButtonGroup();
        c.add(syes);
        c.add(sno);

        JLabel account = new JLabel("Existing Account:");
        account.setFont(new Font("Raleway", Font.BOLD, 20));
        account.setBounds(100, 590, 200, 30);
        add(account);


        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD, 14));
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway", Font.BOLD, 14));
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.white);
        add(eno);


        ButtonGroup e = new ButtonGroup();
        e.add(eyes);
        e.add(eno);


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
        String selectReligion = (String) religion.getSelectedItem();
        String selectCategory = (String) category.getSelectedItem();
        String selectIncome = (String) income.getSelectedItem();
        String selectQualification = (String) qualification.getSelectedItem();
        String selectOccupation = (String) occupation.getSelectedItem();
        String panNumber = pan.getText();
        String aadhaarNumber = aadhaar.getText();
        String selectAge = null;
        if (syes.isSelected()) {
            selectAge = "Yes";
        } else if (sno.isSelected()) {
            selectAge = "No";
        }
        String selectAccount = null;
        if (eyes.isSelected()) {
            selectAccount = "Yes";
        } else if (eno.isSelected()) {
            selectAccount = "No";
        }

        try {
            if (panNumber.equals("")) {
                JOptionPane.showMessageDialog(null, "Pan number is required");
            } else if (aadhaarNumber.equals("")) {
                JOptionPane.showMessageDialog(null, "Aadhaar number is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno +"' ,'" + selectReligion + "' ,'" + selectCategory + "' ,'" + selectIncome
                        + "' ,'" + selectQualification + "' ,'" + selectOccupation + "' ,'" + panNumber + "' ,'" + aadhaarNumber + "' ,'"
                        + selectAge + "' ,'" + selectAccount + "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }

}
