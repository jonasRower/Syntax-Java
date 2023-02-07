import java.awt.Component;

import javax.swing.JOptionPane;


public class A {
	
	int i; 
	private int j;
	public int k;
	
	
	void nastavPrivate(int x, int y) {
		i = x;
		j = y;
	}
	
	void nastavPublic(int x, int y) {
		i = x;
		k = y;
	}
	
}
