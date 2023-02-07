import java.awt.Component;

import javax.swing.JOptionPane;


public class Gen<T> {
	
	T ob;		// deklarace objektu typu T
	
	//konstruktor tridy
	Gen(T o) {
		ob = o;
	}
	
	//Vraceni objektu ob
	T getob() {
		return ob;
	}
	
	//Zobrazeni typu T
	String showType() {
		String text;
		text = ob.getClass().getName();
		
		return text;
	}

}
