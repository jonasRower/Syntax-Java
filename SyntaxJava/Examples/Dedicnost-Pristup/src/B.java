import java.awt.Component;

import javax.swing.JOptionPane;


public class B extends A{
	int total;
	
	String sumPrivate()
	{
		//total = i + j; //CHYBA
		
		String text;
		text = "Promenna 'j' neni pristupna \n CHYBA";
		
		return text;

	}
	
	String sumPublic()
	{
		total = i + k;
		
		String text;
		text = "" + total;
		
		return text;

	}
}
