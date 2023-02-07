
public class novaTrida2 {
	//tato trida demonstruje co se stane kdyz neni this
	
	String promenna;
	
	novaTrida2(String promenna)
	{
		// pokud nechceme this, pak musime pouzit jiny nazev parametru
		promenna = promenna;
	}
	
	String VratPromennou()
	{
		return promenna;
	}

}