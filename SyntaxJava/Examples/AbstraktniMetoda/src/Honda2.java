import java.awt.Component;

import javax.swing.JOptionPane;


class Honda2 extends Bike2{
	
	String text;
	
	//musi byt run5 jinak nejde zkompilovat
	void run2()
	{
		text = "Bike obj = new Honda4()";
		
		//Vytiskne data do messageboxu
		Component frame = null;
		JOptionPane.showMessageDialog(frame,text);
	}

}
