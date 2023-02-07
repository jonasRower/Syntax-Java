import java.awt.Component;

import javax.swing.JOptionPane;


public class NonGen<T> {
	
	Object ob;		// ob je nyní typu Object
	
	//konstruktor tridy
	NonGen(Object o) {
		ob = o;
	}
	
	//Vraceni objektu ob
	Object getob() {
		return ob;
	}
	
	//Zobrazeni typu T
	String showType() {
		String text;
		text = ob.getClass().getName();
		
		return text;
	}

}
