package com.practicingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GUI4 implements ActionListener {

	private void writeToF(String list) throws IOException{
		
        File f = new File("C:\\Java\\notes.txt");
        System.out.println(f);
        FileWriter fw = new FileWriter(f,true);
        System.out.println(fw);
        try{
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println(bw);
            bw.newLine();
            bw.write(list);
            bw.flush();
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

}


	public void actionPerformed(ActionEvent e) {
		GUI4 noters = new GUI4();
		try {
			noters.writeToF(GUI.notes.getText());
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
}
	
	
}
