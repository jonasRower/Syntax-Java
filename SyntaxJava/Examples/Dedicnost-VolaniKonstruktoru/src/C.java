import java.awt.Component;

import javax.swing.JOptionPane;


public class C extends B{

	C()
	{
		String text;
		text = "Konstruktor tridy C";
		
		//Vytiskne data do messageboxu
		Component frame = null;
		JOptionPane.showMessageDialog(frame,text);
	}
	
	void callme() 
	{
		String text;
		text = "Kod Callme tridy C";
		
		//Vytiskne data do messageboxu
		Component frame = null;
		JOptionPane.showMessageDialog(frame,text);
	}
	
}
