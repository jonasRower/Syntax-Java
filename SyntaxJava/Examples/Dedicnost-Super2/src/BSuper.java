import java.awt.Component;

import javax.swing.JOptionPane;


public class BSuper extends A{
	int i; // tato promenna i skryva promennou z tridy A
	
	BSuper (int a, int b)
	{
		super.i = a; // promenna i tridy A
		i = b;		 //promenna i tridy B
	}
	
	int VratI ()
	{
		return i;
	}
	
	int VratSuperI ()
	{
		return super.i;
	}
	
}
