
public class novaTrida {
	
	
	
	public String VratVyjimku()
	{
	
		int d, a;
		String text;
		text = "";
		
		try
		{
			d = 0;
			a = 41 / d;
			
			text = "Tento text se vubec nezobrazi";	
		}
		
		catch(ArithmeticException e)
		{
			text = text + "\nDeleni nulou";	
		}
		
		text = text + "\nTento prikaz je proveden po prikazu catch";	
	
		return text;
	}

}
