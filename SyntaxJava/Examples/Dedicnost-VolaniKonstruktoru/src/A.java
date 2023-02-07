import java.awt.Component;

import javax.swing.JOptionPane;


public class A {
	
	A() {
		
		String text;
		text = "Konstruktor tridy A";
		
		//Vytiskne data do messageboxu
		Component frame = null;
		JOptionPane.showMessageDialog(frame,text);
	}
	
	void callme() 
	{
		
		String text;
		text = "Kod Callme tridy A";
		
		//Vytiskne data do messageboxu
		Component frame = null;
		JOptionPane.showMessageDialog(frame,text);
	}

}
