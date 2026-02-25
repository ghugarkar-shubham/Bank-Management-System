package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JButton login, clear, signup;
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	Login(){
		setTitle("AUTOMATED TELLER MACHINE");
		setLayout(null);
		
		ImageIcon ic1 = new ImageIcon(getClass().getResource("/icons/logo.jpg"));
		Image ig1 = ic1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon ic2 = new ImageIcon(ig1);
		
		JLabel lable1 = new JLabel(ic2);
		lable1.setBounds(80, 10, 100, 100);
		add(lable1);
		
		JLabel text = new JLabel("WELCOME TO ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		JLabel card = new JLabel("Card No. : ");
		card.setFont(new Font("Ralway", Font.BOLD, 28));
		card.setBounds(120, 150, 150, 30);
		add(card);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardTextField);
		
		JLabel pin = new JLabel("PIN : ");
		pin.setFont(new Font("Ralway", Font.BOLD, 28));
		pin.setBounds(120, 220, 150, 30);
		add(pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 230, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(pinTextField);
		
		login = new JButton("SIGN IN");
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.setBounds(300, 300, 100, 30);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("CLEAR");
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.setBounds(430, 300, 100, 30);
		clear.addActionListener(this);
		add(clear);
		
		signup = new JButton("SIGN UP");
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.setBounds(300, 350, 230, 30);
		signup.addActionListener(this);
		add(signup);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800, 480);
		setVisible(true);
		setLocation(300, 150);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		}
		else if(e.getSource() == login) {
			
		}
		else {
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new Login();
	}

}
