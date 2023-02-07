
public class Pravouhelnik extends Utvar{
	
	Pravouhelnik(double a, double b)
	{
		super(a,b);
	}
	
	//prekryti metody plocha() pro vypocet plochy pravouhelnika
	double plocha()
	{
		//kod metody pro vypocet pravouhelnika
		return dim1 * dim2;
	}

}
