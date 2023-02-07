import java.awt.Component;

import javax.swing.JOptionPane;


public class A2 {
	
	int i, j;
	
	A2(int a, int b)
	{
		i = a;
		j = b;
	}
	
	final String show() {
		
		String text;
		text = "Hodnoty i a j: " + i + "  " + j;
		
		return text;

	}
	
}
