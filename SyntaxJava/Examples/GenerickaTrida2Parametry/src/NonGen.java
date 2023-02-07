import java.awt.Component;

import javax.swing.JOptionPane;


public class NonGen<T> {
	
	Object ob1;		// ob je nyní typu Object
	Object ob2;
	
	//konstruktor tridy
	NonGen(Object o1, Object o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	//Vraceni objektu ob
	Object getob1() {
		return ob1;
	}
	
	Object getob2() {
		return ob2;
	}
	
	
	//Zobrazeni typu T
	String showType() {
		String text;

		text = ob1.getClass().getName() + "\n";
		text = text + ob2.getClass().getName() + "\n";
		
		return text;
	}

}
