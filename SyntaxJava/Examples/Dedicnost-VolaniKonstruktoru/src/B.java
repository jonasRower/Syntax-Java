import java.awt.Component;

import javax.swing.JOptionPane;


public class B extends A{

	B()
	{
		String text;
		text = "Konstruktor tridy B";
		
		//Vytiskne data do messageboxu
		Component frame = null;
		JOptionPane.showMessageDialog(frame,text);
	}
	
	void callme() 
	{
		String text;
		text = "Kod Callme tridy B";
		
		//Vytiskne data do messageboxu
		Component frame = null;
		JOptionPane.showMessageDialog(frame,text);
	}
	
}
