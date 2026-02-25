package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupOne extends JFrame {

    SignupOne() {

        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 32));
        formno.setBounds(140, 20, 600, 35);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        personalDetails.setBounds(280, 55, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(80, 110, 200, 25);
        add(name);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(280, 110, 380, 25);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name : ");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(80, 150, 200, 25);
        add(fname);

        JTextField fnameTextField = new JTextField();
        fnameTextField.setBounds(280, 150, 380, 25);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth : ");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(80, 190, 200, 25);
        add(dob);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(280, 190, 380, 25);
        add(dateChooser);

        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(80, 230, 200, 25);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(280, 230, 80, 25);
        male.setBackground(Color.WHITE);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(370, 230, 100, 25);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email : ");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(80, 270, 200, 25);
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(280, 270, 380, 25);
        add(emailTextField);

        JLabel status = new JLabel("Marital Status : ");
        status.setFont(new Font("Raleway", Font.BOLD, 18));
        status.setBounds(80, 310, 200, 25);
        add(status);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(280, 310, 100, 25);
        married.setBackground(Color.WHITE);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(390, 310, 100, 25);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(500, 310, 80, 25);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(married);
        statusGroup.add(unmarried);
        statusGroup.add(other);

        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(80, 350, 200, 25);
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setBounds(280, 350, 380, 25);
        add(addressTextField);

        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(80, 390, 200, 25);
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setBounds(280, 390, 380, 25);
        add(cityTextField);

        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(80, 430, 200, 25);
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setBounds(280, 430, 380, 25);
        add(stateTextField);

        JLabel pinCode = new JLabel("Pin Code : ");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 18));
        pinCode.setBounds(80, 470, 200, 25);
        add(pinCode);

        JTextField pinCodeTextField = new JTextField();
        pinCodeTextField.setBounds(280, 470, 380, 25);
        add(pinCodeTextField);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(580, 520, 80, 30);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 620);          
        setLocationRelativeTo(null); 
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}