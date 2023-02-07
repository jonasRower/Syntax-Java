import java.awt.Component;

import javax.swing.JOptionPane;


public class B extends A{
	int i; // tato promenna i skryva promennou z tridy A
	
	B (int a, int b)
	{
		i = a; 		 //neni pouzito super
		i = b;		 //promenna se prepise
	}
	
	int VratI ()
	{
		return i;
	}
	
	int VratSuperI ()
	{
		return i;
	}
	
}
