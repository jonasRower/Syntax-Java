import java.awt.Component;

import javax.swing.JOptionPane;


class Honda extends Bike{
	
	String text;
	
	void run()
	{
		text = "Bike obj = new Honda4()";
		
		//Vytiskne data do messageboxu
		Component frame = null;
		JOptionPane.showMessageDialog(frame,text);
	}

}
