
public class novaTrida {
	
	String promenna;
	
	//konstruktor bez parametru
	novaTrida()
	{
		//promenou prirazuji uvnitr
		promenna = "10";
	}
	
	//konstruktor s parametrem
	novaTrida(String prom)
	{
		//promennou prirazuji zvenci
		promenna = prom;
	}
	
	String VratPromennou()
	{
		return promenna;
	}

}
