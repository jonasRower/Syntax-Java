
public class Trojuhelnik extends Utvar{
	
	Trojuhelnik(double a, double b)
	{
		super(a,b);
	}
	
	//prekryti metody plocha() pro vypocet plochy trojuhelnika
	double plocha()
	{
		//kod metody pro vypocet trojuhelnika
		return dim1 * dim2;
	}

}
