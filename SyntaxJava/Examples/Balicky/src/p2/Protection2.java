package p2;

public class Protection2 extends p1.Protection {
	
	public Protection2()
	{
		System.out.println("zakladni konstruktor");
		
		//pristup pouze ze stejne tridy ci stejneho balicku
		//System.out.println("n = " + n);
		
		//pristup pouze ze stejne tridy
		//System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}

}
