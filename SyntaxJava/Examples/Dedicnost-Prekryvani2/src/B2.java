import java.awt.Component;

import javax.swing.JOptionPane;


class B2 extends A{
	
	int k;
	
	B2(int a, int b, int c)
	{
		super(a, b);
		k = c;
	}
	

	String show() {
		
		String text;
		
		text = super.show();	//zavola metodu show() z nadtridy
		text = text + "\nHodnota k: " + k;
		
		return text;

	}
	
	
}
