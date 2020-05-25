package com.practicingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class GUI implements ActionListener {
	
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JButton button2;
	private static JLabel success;
	private static Boolean check;
	private static JFrame frame;
	private static JPanel panel;
	private static JFrame frame2;
	private static JPanel panel2;
	static JTextArea notes;
	private static JButton submit;
	private static JLabel notepad;
	private static void readFile() {
		  File f = new File("C:\\Java\\userpass.txt");
		  try{
		         FileReader fr = new FileReader(f);
		         BufferedReader br = new BufferedReader(fr);
		         while(br.ready()){
		         if (br.readLine().contentEquals(userText.getText() + "," +  passwordText.getText()))
		        	 
		         {
		        	 check =true;
		         }
		         else {
		        	 check = false;
		         }
		         
		  }
		         br.close();  
		  }catch(Exception e){
		      System.out.println(e);
		  }
	}

	
	public static void main(String[] args) {
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userlabel = new JLabel("User");
		userlabel.setBounds(10,20,80,25);
		panel.add(userlabel);
		
		 userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		 passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		 passwordText = new JPasswordField(  );
		passwordText.setBounds(100,50,165,25);
		
		panel.add(passwordText);
		
		 button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		button2 = new JButton("Sign Up");
		button2.setBounds(110,80,80,25);
		button2.addActionListener(new GUI2());
		panel.add(button2);
		
		
		 success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		success.setText("");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		GUI userPassRead = new GUI();
				userPassRead.readFile();
		
		
		if(check) {
			
			success.setText("Login Successful");
			frame.setVisible(false);
			frame2 = new JFrame();
			panel2 = new JPanel();
			frame2.setSize(350,200);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.add(panel2);
			panel2.setLayout(null);
			notepad = new JLabel("NOTEPAD");
			notepad.setBounds(100,0,60,20);
			panel2.add(notepad);
			notes = new JTextArea();
			notes.setLineWrap(true);
			notes.setWrapStyleWord(true);
			notes.setBounds(0,20,330,100);
			panel2.add(notes);
			
			submit = new JButton("SUBMIT");
			submit.setBounds(100,130,80,25);
			submit.addActionListener(new GUI4());
			panel2.add(submit);
			frame2.setVisible(true);
			
		}
		
		else {
			success.setText("Wrong Username or Password");
		}
		
		
	}

}
