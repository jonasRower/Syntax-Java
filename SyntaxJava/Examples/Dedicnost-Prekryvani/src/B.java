import java.awt.Component;

import javax.swing.JOptionPane;


class B extends A{
	
	int k;
	
	B(int a, int b, int c)
	{
		super(a, b);
		k = c;
	}
	

	String show() {
		
		String text;
		text = "Hodnota k: " + k;
		
		return text;

	}
	
	
}
