package com.practicingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;





public class GUI3 implements ActionListener {
	
	 private void writeToFile(String list) throws IOException {
		File writeFile = new File("C:\\Java\\userpass.txt");
		System.out.println("Username and Password is saved in " + writeFile);
		FileWriter fw = new FileWriter(writeFile,true);
		System.out.println(fw);
		try {
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println(bw);
			
			bw.write(list);
			bw.newLine();
			bw.flush();
			bw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static String pswrd;
	public static String usr;
	
	
	
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
	usr = GUI2.userText.getText() ;
	pswrd = GUI2.passwordText.getText();
	GUI3 userpass = new GUI3();
	try {
		userpass.writeToFile(usr +","+ pswrd);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	GUI2.frame.setVisible(false);
	System.out.println("Successful");
	
	
	
		}







}

