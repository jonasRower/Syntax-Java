import java.awt.Component;

import javax.swing.JOptionPane;


public class TwoGen<T, V> {
	
	T ob1;
	V ob2;
	
	//konstruktor tridy
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	//Vraceni objektu ob
	T getob1() {
		return ob1;
	}
	
	V getob2() {
		return ob2;
	}
	
	//Zobrazeni typu T
	String showTypes() {
		String text;
		text = ob1.getClass().getName() + "\n";
		text = text + ob2.getClass().getName() + "\n";
		
		return text;
	}

}
