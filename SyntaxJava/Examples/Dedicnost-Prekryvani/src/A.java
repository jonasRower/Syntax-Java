import java.awt.Component;

import javax.swing.JOptionPane;


public class A {
	
	int i, j;
	
	A(int a, int b)
	{
		i = a;
		j = b;
	}
	
	String show() {
		
		String text;
		text = "Hodnoty i a j: " + i + "  " + j;
		
		return text;

	}
	
}
