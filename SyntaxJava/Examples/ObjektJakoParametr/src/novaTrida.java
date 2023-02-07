//zde se nachazi v instanci trida1

public class novaTrida {
	
	int a;
	
	novaTrida(int i)
	{
		a = i;
	}
	
	String VratPromennou1 (novaTrida trida)
							//zde je trida2 , ale ta se nepouzije
	{
		
		String promenna;
		//promenna je v teto instanci (trida1)
		promenna = "" + a;
	
		return promenna;
	}
	
	String VratPromennou2 (novaTrida trida)
	{
		
		String promenna;
		//promenna je v jine instanci (trida2)
		promenna = "" + trida.a;
	
		return promenna;
	}

}
