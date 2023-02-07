package p1;

public class Derived extends Protection {
	
	String Text = "";
	
	Derived()
	{
		
		Text = Text + "odvozeny konstruktor" + "\n";
		Text = Text + "n = " + n + "\n";
		
		Text = Text + "n_pri = - nelze (private)"  + "\n";
		Text = Text + "n_pro = " + n_pro + "\n";
		Text = Text + "n_pub = " + n_pub + "\n";
		
		
		System.out.println("odvozeny konstruktor");
		System.out.println("n = " + n);
		
		//pristup pouze ze stejne tridy
		//System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
		
	}
	
	public String VratText()
	{
		return Text;
	}
	

}
