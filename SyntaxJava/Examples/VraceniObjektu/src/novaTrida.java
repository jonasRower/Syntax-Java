
public class novaTrida {
	
	int a;
	
	novaTrida(int i)
	{
		a = i;
	}
	
	novaTrida incrByTen()
	{
		novaTrida temp = new novaTrida(a + 10);
		
		return temp;
	}

}
