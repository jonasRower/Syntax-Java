import java.awt.Component;

import javax.swing.JOptionPane;


class B2 extends A2{
	
	int k;
	
	B2(int a, int b, int c)
	{
		super(a, b);
		k = c;
	}
	
	//Nelze zkompilovat, protoze metoda show 
	//v třídě A2 je oznacena jako final
	/*
	String show() {
		
		String text;
		text = "Hodnota k: " + k;
		
		return text;

	}
	*/
	
}
