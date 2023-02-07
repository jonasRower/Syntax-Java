import java.awt.Component;

import javax.swing.JOptionPane;


public class GenMethDemo<T> {
	
	static <T, V extends T> boolean isIn(T x, V[] y) 
	{
		for (int i = 0; i < y.length; i++)
			if (x.equals(y[i])) return true;
		
		return false;

	}
	
	String VratText()
	{
		
		String Text;
		Text = "";
		
		Integer nums[] = { 1, 2, 3, 4, 5 };
		
		if(isIn(2, nums))
			Text = Text + "Cislo 2 je v poli nums\n";
		
		if(!isIn(7, nums))
			Text = Text + "Cislo 7 neni v poli nums\n";
			
		String strs[] = { "jedna", "dve", "tri", "ctyri", "pet"};
		
		if(isIn("dve", strs))
			Text = Text + "Cislo dve je v poli strs\n";
		
		if(!isIn("sedm", strs))
			Text = Text + "Cislo sedm neni v poli strs\n";
		
		return Text;
		
	}
		
	

}
