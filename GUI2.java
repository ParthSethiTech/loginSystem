package com.practicingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI2 implements ActionListener {
	public static JFrame frame;
	public static JPanel panel;
	public static JLabel user;
	public static JTextField userText;
	public static JLabel Password;
	public static JPasswordField passwordText;
	public static JButton button;
	public static JButton button2;
	public static void main(String args[]) {
	
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame = new JFrame();
		panel = new JPanel();
		
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		user = new JLabel("Enter Username");
		user.setBounds(10,20,100,25);
		panel.add(user);
		
		userText = new JTextField(20);
		userText.setBounds(110, 20, 165, 25);
		panel.add(userText);
		
		Password = new JLabel("Enter Password");
		Password.setBounds(10,50,100,25);
		panel.add(Password);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(110,50,165,25);
		panel.add(passwordText);
		
		
		button = new JButton("Submit");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI3());

		panel.add(button);
		
		button2 = new JButton("Go Back");
		button.setBounds(110,80,80,25);
		frame.setVisible(true);
		
		
		
		
	}
	

}
