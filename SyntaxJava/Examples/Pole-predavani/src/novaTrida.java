
public class novaTrida {
	
	String VratPole()
	{
		String text;
		
		Pole1D tridaPole = new Pole1D();
		
		//nevolam zde zadnou funkci pro naplneni pole
		//pole je naplneno v konstruktoru
		
		text = "" + tridaPole.twoD[0] + "   " + tridaPole.twoD[1];
		
		
		return text;
		
	}
	
	String VratPole2D()
	{
		String text;
		int i, j;
		
		Pole2D tridaPole2D = new Pole2D();
		
		// naplni pole hodnotami
		// pole zde plneno konstruktorem neni
		
		tridaPole2D.definujPole();
		
		text = "";
		
		for (i = 0; i < 4; i++){
			for (j = 0; j < 5; j++)	
				text = text + tridaPole2D.twoD[i][j] + "  ";
			text = text + "\n";
		}
		
		return text;
	}
	
}
