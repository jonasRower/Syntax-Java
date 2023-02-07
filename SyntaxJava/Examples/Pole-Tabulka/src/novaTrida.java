
//spatne, protoze definuji delku pokazde znovu

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
		String ObsahBunky;
		String Bunka;
		
		int delkaNejdelsiPolozky;
		int i, j;
		
		String cislo;
		
		Pole2D tridaPole2D = new Pole2D();
		
		// naplni pole hodnotami
		// pole zde plneno konstruktorem neni
		
		tridaPole2D.definujPole();
		
		text = "";
		ObsahBunky = "";
		
		delkaNejdelsiPolozky = VratDelkuNejdelsiPlozky();
		delkaNejdelsiPolozky = delkaNejdelsiPolozky + 1;
		
		for (i = 0; i < 4; i++){
			for (j = 0; j < 5; j++){	
				ObsahBunky = "" + tridaPole2D.twoD[i][j];
				Bunka = NakresliBunku(ObsahBunky,delkaNejdelsiPolozky);
				text = text + Bunka;
			}
			text = text + "|\n";
		}
		
		return text;
	}
	
	
	String NakresliBunku(String ObsahBunky, int delkaBunky)
	{
		String text;
		int i;
		int delkaStringu;
		
		delkaStringu = ObsahBunky.length();
		
		text = "| " + ObsahBunky;
		
		for (i = delkaStringu; i < delkaBunky; i++){
			text = text + " ";
		}
		
		return text;
	}
	
	
	int VratDelkuNejdelsiPlozky()
	{
		int nejdelsiDelka;
		String polozka;
		int delkaPolozky;
		
		int r, s;
		delkaPolozky = 0;
		nejdelsiDelka = 0;
		polozka = "";
		
		Pole2D tridaPole2D = new Pole2D();
		tridaPole2D.definujPole();
		
		for (r = 0; r < 4; r++){
			for (s = 0; s < 5; s++){	
				polozka = "" + tridaPole2D.twoD[r][s];
				delkaPolozky = polozka.length();
				if (delkaPolozky > nejdelsiDelka)
				{
					nejdelsiDelka = delkaPolozky;
				}
			}
		}
		
		return nejdelsiDelka;
		
	}
}
