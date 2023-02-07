import java.awt.Component;

import javax.swing.JOptionPane;


public class KrabiceHmotnostSuper extends KrabiceObjem{
	
	double hmotnost;
	
	//konstruktor pro klon
	//vytvoreni klonu objektu
	KrabiceHmotnostSuper(KrabiceHmotnostSuper ob)
	{
		super(ob);
		hmotnost = ob.hmotnost;
	}
	
	//konstruktor s 1 parameterem
	KrabiceHmotnostSuper(double m){
		super(m);
		hmotnost = m;
	}
	
	//konstruktor bez paramentru
	KrabiceHmotnostSuper(){
		super();
		hmotnost = -1;
	}
	
	//konstruktor s 1 parameterem
	KrabiceHmotnostSuper(double len, double m){
		super(len);
		hmotnost = m;
	}
	
	
}
