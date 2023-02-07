
public class novaTrida {
	
	int a, b;
	
	novaTrida(int i, int j)
	{
		a = i;
		b = j;
	}
	
	boolean equals(novaTrida trida)
	{
		if(trida.a == a && trida.b == b)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

}
