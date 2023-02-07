import java.awt.Component;

import javax.swing.JOptionPane;


public class KrabiceHmotnost extends KrabiceObjem{
	
	double hmotnost;
	
	//konstruktor pro klon
	//vytvoreni klonu objektu
	KrabiceHmotnost(KrabiceHmotnost ob)
	{
		//super(ob);
		hmotnost = ob.hmotnost;
	}
	
	//konstruktor s 1 parameterem
	KrabiceHmotnost(double m){
		//super(m);
		hmotnost = m;
		
	}
	
	//konstruktor bez paramentru
	KrabiceHmotnost(){
		//super();
		hmotnost = -1;
	}
	
	//konstruktor s 1 parameterem
	KrabiceHmotnost(double len, double m){
		//super(len);
		hmotnost = m;
	}
	
}
