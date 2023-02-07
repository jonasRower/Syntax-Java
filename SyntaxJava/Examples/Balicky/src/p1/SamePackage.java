package p1;

public class SamePackage extends Protection {
	
	SamePackage()
	{
		Protection p = new Protection();
		System.out.println("konstruktor tridy ve stejnem balicku");
		System.out.println("n = " + p.n);
		
		//pristup pouze ze stejne tridy
		//System.out.println("n_pri = " + p.n_pri);
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
	

}
