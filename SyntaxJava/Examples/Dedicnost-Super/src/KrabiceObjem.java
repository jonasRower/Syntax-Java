import java.awt.Component;

import javax.swing.JOptionPane;


public class KrabiceObjem {
	
	double objem;
	
	//konstruktor pro klon
	//vytvoreni klonu objektu
	KrabiceObjem(KrabiceObjem ob)
	{
		objem = ob.objem;
	}
	
	//konstruktor s 1 parameterem
	KrabiceObjem(double o){
		objem = o;
	}
	
	//konstruktor bez paramentru
	KrabiceObjem(){
		objem = -1;
	}
	
	double VratObjemKrabice()
	{
		return objem;
	}
	
}
